/**
 * Класс Person с переопределенным методом equals().
 *
 * @author lsszrn
 * @version 1.0
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    @Override
    public boolean equals(Object obj) {
        // 1. Проверка на идентичность ссылок
        if (this == obj) {
            return true;
        }
        
        // 2. Проверка на null
        if (obj == null) {
            return false;
        }
        
        // 3. Проверка на совпадение классов
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        
        // 4. Приведение типа и сравнение полей
        Person other = (Person) obj;
        
        if (this.age != other.age) {
            return false;
        }
        
        if (this.firstName == null) {
            if (other.firstName != null) {
                return false;
            }
        } else if (!this.firstName.equals(other.firstName)) {
            return false;
        }
        
        if (this.lastName == null) {
            if (other.lastName != null) {
                return false;
            }
        } else if (!this.lastName.equals(other.lastName)) {
            return false;
        }
        
        return true;
    }
    
    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }
    
    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + age + " лет)";
    }
}
