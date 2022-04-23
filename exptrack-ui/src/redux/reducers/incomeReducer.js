import { ActionTypes } from "../constants/actionTypes";

const initialState = {
  incomes: [
    {
      id: 1,
      desc: "hello",
      accountId: 1,
    },
  ],
};

const incomeReducer = (state = initialState, { type, payload }) => {
  switch (type) {
    case ActionTypes.GET_INCOME:
      return state;
    case ActionTypes.GET_ALL_INCOMES:
      return state;
    case ActionTypes.SAVE_INCOME:
      return state;
    case ActionTypes.GET_INCOMES_FOR_ACCOUNT:
      return state;
    default:
      return state;
  }
};

export default incomeReducer;
