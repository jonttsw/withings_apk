package com.withings.wiscale2.food.model;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.d0;
import androidx.room.j;
import androidx.room.k;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.joda.time.DateTime;
import pm.b;
import x8.a;
import z8.f;
/* loaded from: classes5.dex */
public final class MealNameDao_RoomDb_Impl implements MealNameDao {
    private final b __commonRoomConverter = new b();
    private final RoomDatabase __db;
    private final j<MealName> __deletionAdapterOfMealName;
    private final k<MealName> __insertionAdapterOfMealName;
    private final j<MealName> __updateAdapterOfMealName;

    public MealNameDao_RoomDb_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfMealName = new k<MealName>(roomDatabase) { // from class: com.withings.wiscale2.food.model.MealNameDao_RoomDb_Impl.1
            @Override // androidx.room.h0
            protected String createQuery() {
                return "INSERT OR ABORT INTO `MealName` (`id`,`userId`,`rank`,`name`,`createdDate`,`modifiedDate`,`brand`) VALUES (?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.k
            public void bind(f fVar, MealName mealName) {
                fVar.v(1, mealName.getId());
                fVar.v(2, mealName.getUserId());
                fVar.v(3, mealName.getRank());
                if (mealName.getName() == null) {
                    fVar.g2(4);
                } else {
                    fVar.s(4, mealName.getName());
                }
                b bVar = MealNameDao_RoomDb_Impl.this.__commonRoomConverter;
                DateTime createdDate = mealName.getCreatedDate();
                bVar.getClass();
                Long e11 = b.e(createdDate);
                if (e11 == null) {
                    fVar.g2(5);
                } else {
                    fVar.v(5, e11.longValue());
                }
                b bVar2 = MealNameDao_RoomDb_Impl.this.__commonRoomConverter;
                DateTime modifiedDate = mealName.getModifiedDate();
                bVar2.getClass();
                Long e12 = b.e(modifiedDate);
                if (e12 == null) {
                    fVar.g2(6);
                } else {
                    fVar.v(6, e12.longValue());
                }
                fVar.v(7, mealName.getBrand());
            }
        };
        this.__deletionAdapterOfMealName = new j<MealName>(roomDatabase) { // from class: com.withings.wiscale2.food.model.MealNameDao_RoomDb_Impl.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.j
            public void bind(f fVar, MealName mealName) {
                fVar.v(1, mealName.getId());
            }

            @Override // androidx.room.j, androidx.room.h0
            protected String createQuery() {
                return "DELETE FROM `MealName` WHERE `id` = ?";
            }
        };
        this.__updateAdapterOfMealName = new j<MealName>(roomDatabase) { // from class: com.withings.wiscale2.food.model.MealNameDao_RoomDb_Impl.3
            @Override // androidx.room.j, androidx.room.h0
            protected String createQuery() {
                return "UPDATE OR ABORT `MealName` SET `id` = ?,`userId` = ?,`rank` = ?,`name` = ?,`createdDate` = ?,`modifiedDate` = ?,`brand` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.j
            public void bind(f fVar, MealName mealName) {
                fVar.v(1, mealName.getId());
                fVar.v(2, mealName.getUserId());
                fVar.v(3, mealName.getRank());
                if (mealName.getName() == null) {
                    fVar.g2(4);
                } else {
                    fVar.s(4, mealName.getName());
                }
                b bVar = MealNameDao_RoomDb_Impl.this.__commonRoomConverter;
                DateTime createdDate = mealName.getCreatedDate();
                bVar.getClass();
                Long e11 = b.e(createdDate);
                if (e11 == null) {
                    fVar.g2(5);
                } else {
                    fVar.v(5, e11.longValue());
                }
                b bVar2 = MealNameDao_RoomDb_Impl.this.__commonRoomConverter;
                DateTime modifiedDate = mealName.getModifiedDate();
                bVar2.getClass();
                Long e12 = b.e(modifiedDate);
                if (e12 == null) {
                    fVar.g2(6);
                } else {
                    fVar.v(6, e12.longValue());
                }
                fVar.v(7, mealName.getBrand());
                fVar.v(8, mealName.getId());
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.withings.wiscale2.food.model.MealNameDao
    public void create(MealName mealName) {
        this.__db.b();
        this.__db.c();
        try {
            this.__insertionAdapterOfMealName.insert((k<MealName>) mealName);
            this.__db.z();
        } finally {
            this.__db.h();
        }
    }

    @Override // com.withings.wiscale2.food.model.MealNameDao
    public void delete(MealName mealName) {
        this.__db.b();
        this.__db.c();
        try {
            this.__deletionAdapterOfMealName.handle(mealName);
            this.__db.z();
        } finally {
            this.__db.h();
        }
    }

    @Override // com.withings.wiscale2.food.model.MealNameDao
    public List<MealName> queryByUserId(long j5) {
        String string;
        Long valueOf;
        d0 c11 = d0.c(1, "SELECT * FROM mealName WHERE userId = ?");
        c11.v(1, j5);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "id");
            int b11 = a.b(c12, NavigationArguments.USER_ID);
            int b12 = a.b(c12, "rank");
            int b13 = a.b(c12, "name");
            int b14 = a.b(c12, "createdDate");
            int b15 = a.b(c12, "modifiedDate");
            int b16 = a.b(c12, "brand");
            ArrayList arrayList = new ArrayList(c12.getCount());
            while (c12.moveToNext()) {
                MealName mealName = new MealName();
                mealName.setId(c12.getLong(b10));
                mealName.setUserId(c12.getLong(b11));
                mealName.setRank(c12.getInt(b12));
                Long l5 = null;
                if (c12.isNull(b13)) {
                    string = null;
                } else {
                    string = c12.getString(b13);
                }
                mealName.setName(string);
                if (c12.isNull(b14)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(c12.getLong(b14));
                }
                this.__commonRoomConverter.getClass();
                mealName.setCreatedDate(b.a(valueOf));
                if (!c12.isNull(b15)) {
                    l5 = Long.valueOf(c12.getLong(b15));
                }
                this.__commonRoomConverter.getClass();
                mealName.setModifiedDate(b.a(l5));
                mealName.setBrand(c12.getInt(b16));
                arrayList.add(mealName);
            }
            return arrayList;
        } finally {
            c12.close();
            c11.release();
        }
    }

    @Override // com.withings.wiscale2.food.model.MealNameDao
    public void update(MealName mealName) {
        this.__db.b();
        this.__db.c();
        try {
            this.__updateAdapterOfMealName.handle(mealName);
            this.__db.z();
        } finally {
            this.__db.h();
        }
    }
}
