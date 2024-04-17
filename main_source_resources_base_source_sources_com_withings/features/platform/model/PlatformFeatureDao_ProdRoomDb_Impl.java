package com.withings.features.platform.model;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import androidx.room.d0;
import androidx.room.g;
import androidx.room.h0;
import androidx.room.j;
import androidx.room.k;
import com.withings.features.platform.api.FeatureRoomConverter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import x8.a;
import x8.b;
import z8.f;
/* loaded from: classes3.dex */
public final class PlatformFeatureDao_ProdRoomDb_Impl implements PlatformFeatureDao {
    private final RoomDatabase __db;
    private final FeatureRoomConverter __featureRoomConverter = new FeatureRoomConverter();
    private final k<PlatformFeature> __insertionAdapterOfPlatformFeature;
    private final h0 __preparedStmtOfClear;
    private final j<PlatformFeature> __updateAdapterOfPlatformFeature;

    public PlatformFeatureDao_ProdRoomDb_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfPlatformFeature = new k<PlatformFeature>(roomDatabase) { // from class: com.withings.features.platform.model.PlatformFeatureDao_ProdRoomDb_Impl.1
            @Override // androidx.room.h0
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `PlatformFeature` (`featureId`,`name`,`owners`,`synced`) VALUES (?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.k
            public void bind(f fVar, PlatformFeature platformFeature) {
                fVar.v(1, platformFeature.getFeatureId());
                if (platformFeature.getName() == null) {
                    fVar.g2(2);
                } else {
                    fVar.s(2, platformFeature.getName());
                }
                fVar.s(3, PlatformFeatureDao_ProdRoomDb_Impl.this.__featureRoomConverter.ownersToString(platformFeature.getOwners()));
                fVar.v(4, platformFeature.getSynced() ? 1L : 0L);
            }
        };
        this.__updateAdapterOfPlatformFeature = new j<PlatformFeature>(roomDatabase) { // from class: com.withings.features.platform.model.PlatformFeatureDao_ProdRoomDb_Impl.2
            @Override // androidx.room.j, androidx.room.h0
            protected String createQuery() {
                return "UPDATE OR ABORT `PlatformFeature` SET `featureId` = ?,`name` = ?,`owners` = ?,`synced` = ? WHERE `featureId` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.j
            public void bind(f fVar, PlatformFeature platformFeature) {
                fVar.v(1, platformFeature.getFeatureId());
                if (platformFeature.getName() == null) {
                    fVar.g2(2);
                } else {
                    fVar.s(2, platformFeature.getName());
                }
                fVar.s(3, PlatformFeatureDao_ProdRoomDb_Impl.this.__featureRoomConverter.ownersToString(platformFeature.getOwners()));
                fVar.v(4, platformFeature.getSynced() ? 1L : 0L);
                fVar.v(5, platformFeature.getFeatureId());
            }
        };
        this.__preparedStmtOfClear = new h0(roomDatabase) { // from class: com.withings.features.platform.model.PlatformFeatureDao_ProdRoomDb_Impl.3
            @Override // androidx.room.h0
            public String createQuery() {
                return "delete from PlatformFeature";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.withings.features.platform.model.PlatformFeatureDao
    public void clear() {
        this.__db.b();
        f acquire = this.__preparedStmtOfClear.acquire();
        try {
            this.__db.c();
            acquire.H();
            this.__db.z();
            this.__db.h();
        } finally {
            this.__preparedStmtOfClear.release(acquire);
        }
    }

    @Override // com.withings.features.platform.model.PlatformFeatureDao
    public List<PlatformFeature> getAllPlatformFeatures() {
        String string;
        boolean z5;
        d0 c11 = d0.c(0, "select * from PlatformFeature");
        this.__db.b();
        Cursor c12 = b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "featureId");
            int b11 = a.b(c12, "name");
            int b12 = a.b(c12, "owners");
            int b13 = a.b(c12, "synced");
            ArrayList arrayList = new ArrayList(c12.getCount());
            while (c12.moveToNext()) {
                int i11 = c12.getInt(b10);
                if (c12.isNull(b11)) {
                    string = null;
                } else {
                    string = c12.getString(b11);
                }
                List<Owner> stringToOwners = this.__featureRoomConverter.stringToOwners(c12.getString(b12));
                if (c12.getInt(b13) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                arrayList.add(new PlatformFeature(i11, string, stringToOwners, z5));
            }
            return arrayList;
        } finally {
            c12.close();
            c11.release();
        }
    }

    @Override // com.withings.features.platform.model.PlatformFeatureDao
    public Flow<List<PlatformFeature>> getAllPlatformFeaturesFlow() {
        final d0 c11 = d0.c(0, "select * from PlatformFeature");
        return g.a(this.__db, false, new String[]{"PlatformFeature"}, new Callable<List<PlatformFeature>>() { // from class: com.withings.features.platform.model.PlatformFeatureDao_ProdRoomDb_Impl.5
            protected void finalize() {
                c11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<PlatformFeature> call() throws Exception {
                Cursor c12 = b.c(PlatformFeatureDao_ProdRoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = a.b(c12, "featureId");
                    int b11 = a.b(c12, "name");
                    int b12 = a.b(c12, "owners");
                    int b13 = a.b(c12, "synced");
                    ArrayList arrayList = new ArrayList(c12.getCount());
                    while (c12.moveToNext()) {
                        arrayList.add(new PlatformFeature(c12.getInt(b10), c12.isNull(b11) ? null : c12.getString(b11), PlatformFeatureDao_ProdRoomDb_Impl.this.__featureRoomConverter.stringToOwners(c12.getString(b12)), c12.getInt(b13) != 0));
                    }
                    return arrayList;
                } finally {
                    c12.close();
                }
            }
        });
    }

    @Override // com.withings.features.platform.model.PlatformFeatureDao
    public LiveData<List<PlatformFeature>> getAllPlatformFeaturesLiveData() {
        final d0 c11 = d0.c(0, "select * from PlatformFeature");
        return this.__db.l().c(new String[]{"PlatformFeature"}, new Callable<List<PlatformFeature>>() { // from class: com.withings.features.platform.model.PlatformFeatureDao_ProdRoomDb_Impl.4
            protected void finalize() {
                c11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<PlatformFeature> call() throws Exception {
                Cursor c12 = b.c(PlatformFeatureDao_ProdRoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = a.b(c12, "featureId");
                    int b11 = a.b(c12, "name");
                    int b12 = a.b(c12, "owners");
                    int b13 = a.b(c12, "synced");
                    ArrayList arrayList = new ArrayList(c12.getCount());
                    while (c12.moveToNext()) {
                        arrayList.add(new PlatformFeature(c12.getInt(b10), c12.isNull(b11) ? null : c12.getString(b11), PlatformFeatureDao_ProdRoomDb_Impl.this.__featureRoomConverter.stringToOwners(c12.getString(b12)), c12.getInt(b13) != 0));
                    }
                    return arrayList;
                } finally {
                    c12.close();
                }
            }
        });
    }

    @Override // com.withings.features.platform.model.PlatformFeatureDao
    public PlatformFeature getFeature(int i11) {
        boolean z5 = true;
        d0 c11 = d0.c(1, "select * from PlatformFeature where featureId =?");
        c11.v(1, i11);
        this.__db.b();
        Cursor c12 = b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "featureId");
            int b11 = a.b(c12, "name");
            int b12 = a.b(c12, "owners");
            int b13 = a.b(c12, "synced");
            PlatformFeature platformFeature = null;
            String string = null;
            if (c12.moveToFirst()) {
                int i12 = c12.getInt(b10);
                if (!c12.isNull(b11)) {
                    string = c12.getString(b11);
                }
                List<Owner> stringToOwners = this.__featureRoomConverter.stringToOwners(c12.getString(b12));
                if (c12.getInt(b13) == 0) {
                    z5 = false;
                }
                platformFeature = new PlatformFeature(i12, string, stringToOwners, z5);
            }
            return platformFeature;
        } finally {
            c12.close();
            c11.release();
        }
    }

    @Override // com.withings.features.platform.model.PlatformFeatureDao
    public Flow<PlatformFeature> getFeatureAsFlow(int i11) {
        final d0 c11 = d0.c(1, "select * from PlatformFeature where featureId =?");
        c11.v(1, i11);
        return g.a(this.__db, false, new String[]{"PlatformFeature"}, new Callable<PlatformFeature>() { // from class: com.withings.features.platform.model.PlatformFeatureDao_ProdRoomDb_Impl.6
            protected void finalize() {
                c11.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public PlatformFeature call() throws Exception {
                Cursor c12 = b.c(PlatformFeatureDao_ProdRoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = a.b(c12, "featureId");
                    int b11 = a.b(c12, "name");
                    int b12 = a.b(c12, "owners");
                    int b13 = a.b(c12, "synced");
                    PlatformFeature platformFeature = null;
                    String string = null;
                    if (c12.moveToFirst()) {
                        int i12 = c12.getInt(b10);
                        if (!c12.isNull(b11)) {
                            string = c12.getString(b11);
                        }
                        platformFeature = new PlatformFeature(i12, string, PlatformFeatureDao_ProdRoomDb_Impl.this.__featureRoomConverter.stringToOwners(c12.getString(b12)), c12.getInt(b13) != 0);
                    }
                    return platformFeature;
                } finally {
                    c12.close();
                }
            }
        });
    }

    @Override // com.withings.features.platform.model.PlatformFeatureDao
    public PlatformFeature getFeatureById(int i11) {
        boolean z5 = true;
        d0 c11 = d0.c(1, "select * from PlatformFeature where featureId =?");
        c11.v(1, i11);
        this.__db.b();
        Cursor c12 = b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "featureId");
            int b11 = a.b(c12, "name");
            int b12 = a.b(c12, "owners");
            int b13 = a.b(c12, "synced");
            PlatformFeature platformFeature = null;
            String string = null;
            if (c12.moveToFirst()) {
                int i12 = c12.getInt(b10);
                if (!c12.isNull(b11)) {
                    string = c12.getString(b11);
                }
                List<Owner> stringToOwners = this.__featureRoomConverter.stringToOwners(c12.getString(b12));
                if (c12.getInt(b13) == 0) {
                    z5 = false;
                }
                platformFeature = new PlatformFeature(i12, string, stringToOwners, z5);
            }
            return platformFeature;
        } finally {
            c12.close();
            c11.release();
        }
    }

    @Override // com.withings.features.platform.model.PlatformFeatureDao
    public LiveData<PlatformFeature> getFeatureLiveData(int i11) {
        final d0 c11 = d0.c(1, "select * from PlatformFeature where featureId =?");
        c11.v(1, i11);
        return this.__db.l().c(new String[]{"PlatformFeature"}, new Callable<PlatformFeature>() { // from class: com.withings.features.platform.model.PlatformFeatureDao_ProdRoomDb_Impl.7
            protected void finalize() {
                c11.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public PlatformFeature call() throws Exception {
                Cursor c12 = b.c(PlatformFeatureDao_ProdRoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = a.b(c12, "featureId");
                    int b11 = a.b(c12, "name");
                    int b12 = a.b(c12, "owners");
                    int b13 = a.b(c12, "synced");
                    PlatformFeature platformFeature = null;
                    String string = null;
                    if (c12.moveToFirst()) {
                        int i12 = c12.getInt(b10);
                        if (!c12.isNull(b11)) {
                            string = c12.getString(b11);
                        }
                        platformFeature = new PlatformFeature(i12, string, PlatformFeatureDao_ProdRoomDb_Impl.this.__featureRoomConverter.stringToOwners(c12.getString(b12)), c12.getInt(b13) != 0);
                    }
                    return platformFeature;
                } finally {
                    c12.close();
                }
            }
        });
    }

    @Override // com.withings.features.platform.model.PlatformFeatureDao
    public List<PlatformFeature> getNotSyncedFeatures() {
        String string;
        boolean z5;
        d0 c11 = d0.c(0, "select * from PlatformFeature where NOT synced");
        this.__db.b();
        Cursor c12 = b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "featureId");
            int b11 = a.b(c12, "name");
            int b12 = a.b(c12, "owners");
            int b13 = a.b(c12, "synced");
            ArrayList arrayList = new ArrayList(c12.getCount());
            while (c12.moveToNext()) {
                int i11 = c12.getInt(b10);
                if (c12.isNull(b11)) {
                    string = null;
                } else {
                    string = c12.getString(b11);
                }
                List<Owner> stringToOwners = this.__featureRoomConverter.stringToOwners(c12.getString(b12));
                if (c12.getInt(b13) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                arrayList.add(new PlatformFeature(i11, string, stringToOwners, z5));
            }
            return arrayList;
        } finally {
            c12.close();
            c11.release();
        }
    }

    @Override // com.withings.features.platform.model.PlatformFeatureDao
    public void insert(List<PlatformFeature> list) {
        this.__db.b();
        this.__db.c();
        try {
            this.__insertionAdapterOfPlatformFeature.insert(list);
            this.__db.z();
        } finally {
            this.__db.h();
        }
    }

    @Override // com.withings.features.platform.model.PlatformFeatureDao
    public void updateFeature(PlatformFeature platformFeature) {
        this.__db.b();
        this.__db.c();
        try {
            this.__updateAdapterOfPlatformFeature.handle(platformFeature);
            this.__db.z();
        } finally {
            this.__db.h();
        }
    }

    @Override // com.withings.features.platform.model.PlatformFeatureDao
    public void updateFeatures(List<PlatformFeature> list) {
        this.__db.b();
        this.__db.c();
        try {
            this.__updateAdapterOfPlatformFeature.handleMultiple(list);
            this.__db.z();
        } finally {
            this.__db.h();
        }
    }
}
