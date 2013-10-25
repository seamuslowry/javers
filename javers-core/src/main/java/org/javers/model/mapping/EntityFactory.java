package org.javers.model.mapping;

import org.javers.model.mapping.type.TypeMapper;

import java.util.List;

/**
 * @author bartosz walacik
 */
public class EntityFactory extends ManagedClassFactory<Entity>{

    public EntityFactory(PropertyScanner propertyScanner) {
        super(propertyScanner);
    }

    @Override
    public <S> Entity create(Class<S> clazz) {
        List<Property> beanProperties = propertyScanner.scan(clazz);
        return new Entity<>(clazz, beanProperties);
    }
}