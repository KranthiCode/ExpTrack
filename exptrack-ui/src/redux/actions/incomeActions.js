import { ActionTypes } from "../constants/actionTypes";

export const getAllIncomes = () => {
  return {
    type: ActionTypes.GET_ALL_INCOMES,
    payload: null,
  };
};

export const getIncomesForAccount = (accountId) => {
  return {
    type: ActionTypes.GET_INCOMES_FOR_ACCOUNT,
    payload: accountId,
  };
};

export const saveIncome = (income) => {
  return {
    type: ActionTypes.SAVE_INCOME,
    payload: income,
  };
};
