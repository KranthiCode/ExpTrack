import { ActionTypes } from "../constants/actionTypes";

export const getAllExpenses = () => {
  return {
    type: ActionTypes.GET_ALL_EXPENSES,
    payload: null,
  };
};

export const getExpensesForAccount = (accountId) => {
  return {
    type: ActionTypes.GET_EXPENSES_FOR_ACCOUNT,
    payload: accountId,
  };
};

export const saveExpense = (expense) => {
  return {
    type: ActionTypes.SAVE_EXPENSE,
    payload: expense,
  };
};
