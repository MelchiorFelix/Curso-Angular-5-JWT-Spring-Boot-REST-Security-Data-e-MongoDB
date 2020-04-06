import { DaoInterface } from "./dao.interfece";
import { PersonDao } from "./person-dao";
import { Person } from "../Aula2-classes/person";

let personDao: DaoInterface = new PersonDao();
let person: Person = new Person('Mike');

personDao.insert(person);