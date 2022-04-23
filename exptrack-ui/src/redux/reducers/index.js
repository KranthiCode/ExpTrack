import { combineReducers } from "redux";
import expenseReducer from "./expenseReducer";
import incomeReducer from "./incomeReducer";

const reducers = combineReducers({
  expense: expenseReducer,
  income: incomeReducer,
});

export default reducers;
