package org.javers.core.diff.changetype.container;

/**
 * element added to collection
 *
 * @author bartosz walacik
 */
public class ValueAdded extends ValueAddOrRemove {

    public ValueAdded(int index, Object value) {
        super(index, value);
    }

    public ValueAdded(Object value) {
        super(value);
    }

    public Object getAddedValue() {
        return value.unwrap();
    }
}
