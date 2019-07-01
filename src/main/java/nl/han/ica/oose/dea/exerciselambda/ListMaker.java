package nl.han.ica.oose.dea.exerciselambda;

import nl.han.ica.oose.dea.exerciselambda.person.Gender;
import nl.han.ica.oose.dea.exerciselambda.person.Person;

import java.util.ArrayList;
import java.util.List;

public class ListMaker {

    private static final int ADULT_AGE = 18;

    /**
     * Create a {@link List} containing only the Persons that are both male and adult.
     *
     * @param allPersons A {@link List} of {@link Person} Objects
     * @return A {@link List} containing only the Persons that are both male and adult
     */
    public List<Person> createMaleAdultList(List<Person> allPersons) {
        return createAdultList(allPersons, Gender.MALE);
    }

    /**
     * Create a {@link List} containing only the Persons that are both female and adult.
     *
     * @param allPersons A {@link List} of {@link Person} Objects
     * @return A {@link List} containing only the Persons that are both female and adult
     */
    public List<Person> createFemaleAdultList(List<Person> allPersons) {
        return createAdultList(allPersons, Gender.FEMALE);
    }

    private List<Person> createAdultList(List<Person> allPersons, Gender gender) {
        List<Person> filteredAdults = new ArrayList<>();

        if (allPersons == null) {
            return filteredAdults;
        }

        allPersons.forEach(person -> {
            if (person.isOfGender(gender) && person.isAdult(ADULT_AGE)) {
                filteredAdults.add(person);
            }
        });

        return filteredAdults;
    }
}
