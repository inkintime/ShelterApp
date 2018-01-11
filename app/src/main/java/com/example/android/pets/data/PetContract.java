package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by johnvicencio on 11/01/2018.
 */

public final class PetContract {

    public static abstract class PetEntry implements BaseColumns {

        public static final String TABLE_NAME="pets";
        public static final String COLUMN_NAME="name";
        public static final String COLUMN_BREED="breed";
        public static final String COLUMN_GENDER="gender";
        public static final String COLUMN_WEIGHT="weight";

        public static final String GENDER_MALE="1";
        public static final String GENDER_FEMIALE="2";
        public static final String GENDER_UNKNOWN="0";

    }

}
