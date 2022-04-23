import { ActionTypes } from "../constants/actionTypes";

const initialState = {
  expenses: [
    {
      id: 1,
      desc: "hello",
      accountId: 1,
    },
  ],
};

const expenseReducer = (state = initialState, { type, payload }) => {
  switch (type) {
    case ActionTypes.GET_EXPENSE:
      return state;
    case ActionTypes.GET_ALL_EXPENSES:
      return state;
    case ActionTypes.SAVE_ACCOUNT:
      return state;
    case ActionTypes.GET_EXPENSES_FOR_ACCOUNT:
      return state;
    default:
      return state;
  }
};

export default expenseReducer;
