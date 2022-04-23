import { useEffect, useState } from "react";

const ExpensePage = (props) => {
  const [expenses, setExpenses] = useState([]);

  useEffect(() => {
    fetch(`http://localhost:8080/accounts/${props.accountId}/expenses`)
      .then((response) => response.json())
      .then((data) => {
        console.log(data);
        setExpenses(data);
      });
  }, [props.accountId]);

  return (
    <div>
      {expenses.map((expense) => (
        <tr>
          <td>
            <span>{expense.id}</span>
            <span>{expense.desc}</span>
            <span>{expense.amount}</span>
            <span>{expense.date}</span>
          </td>
        </tr>
      ))}
    </div>
  );
};

export default ExpensePage;
