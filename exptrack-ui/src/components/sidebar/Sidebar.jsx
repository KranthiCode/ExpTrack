import { useEffect, useState } from "react";
import "./sidebar.css";

export const Sidebar = () => {
  const [accounts, setAccounts] = useState(new Map());

  useEffect(() => {
    fetch("http://localhost:8080/accounts")
      .then((response) => response.json())
      .then((data) => {
        console.log("data received: " + data);
        setAccounts(
          data.reduce(
            (entryMap, e) =>
              entryMap.set(e.type, [...(entryMap.get(e.type) || []), e]),
            new Map()
          )
        );
      });
  }, []);

  return (
    <div className="left-nav">
      <SidebarHeader />
      <SidebarAccounts accounts={accounts} />
    </div>
  );
};

const SidebarHeader = () => {
  return (
    <div className="header">
      <div className="header-label">
        <h3>Accounts</h3>
      </div>
      <div className="header-actions">
        <span className="material-icons">refresh</span>
        <span className="material-icons">add</span>
        <span className="material-icons">more_horiz</span>
      </div>
    </div>
  );
};

const SidebarAccounts = (props) => {
  const accountsMap = props.accounts;
  // eslint-disable-next-line no-lone-blocks
  return (
    <div className="accounts-container">
      {[...accountsMap.entries()].map((entry) => {
        return <SidebarAccountType accountEntry={entry} />;
      })}
    </div>
  );
};

const SidebarAccountType = (props) => {
  const accountType = props.accountEntry[0];
  const accounts = props.accountEntry[1];
  return (
    <div className="accounts">
      <div className="accounts-type">
        <span className="accounts-type-name">
          <h3>{accountType}</h3>
        </span>
      </div>

      {accounts.map((account) => {
        return <SidebarAccount account={account} />;
      })}
    </div>
  );
};

// link view for sidebar account
const SidebarAccount = (props) => {
  return (
    <div className="account">
      <button className="account-name">{props.account.name}</button>
      <span className="account-balance">{props.account.openingBalance}</span>
    </div>
  );
};

export default Sidebar;
