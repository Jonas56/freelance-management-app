package com.freelance.models;

import com.freelance.beans.Mission;

public class MissionRepository extends CrudRepository<Mission , Integer > implements IMissionRepository {
    public MissionRepository()
    {
        super(Mission.class);
    }
}
