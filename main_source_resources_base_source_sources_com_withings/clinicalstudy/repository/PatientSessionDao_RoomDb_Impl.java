package com.withings.clinicalstudy.repository;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.d0;
import androidx.room.j;
import java.util.Collections;
import java.util.List;
import x8.a;
import x8.b;
import z8.f;
/* loaded from: classes3.dex */
public final class PatientSessionDao_RoomDb_Impl implements PatientSessionDao {
    private final RoomDatabase __db;
    private final j<PatientSessionEntity> __updateAdapterOfPatientSessionEntity;

    public PatientSessionDao_RoomDb_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__updateAdapterOfPatientSessionEntity = new j<PatientSessionEntity>(roomDatabase) { // from class: com.withings.clinicalstudy.repository.PatientSessionDao_RoomDb_Impl.1
            @Override // androidx.room.j, androidx.room.h0
            protected String createQuery() {
                return "UPDATE OR REPLACE `PatientSession` SET `id` = ?,`patientId` = ?,`startTime` = ?,`endTime` = ?,`ecgCount` = ?,`workoutCount` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.j
            public void bind(f fVar, PatientSessionEntity patientSessionEntity) {
                if (patientSessionEntity.getId() == null) {
                    fVar.g2(1);
                } else {
                    fVar.v(1, patientSessionEntity.getId().longValue());
                }
                fVar.s(2, patientSessionEntity.getPatientId());
                fVar.v(3, patientSessionEntity.getStartTime());
                fVar.v(4, patientSessionEntity.getEndTime());
                fVar.v(5, patientSessionEntity.getEcgCount());
                fVar.v(6, patientSessionEntity.getWorkoutCount());
                if (patientSessionEntity.getId() == null) {
                    fVar.g2(7);
                } else {
                    fVar.v(7, patientSessionEntity.getId().longValue());
                }
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.withings.clinicalstudy.repository.PatientSessionDao
    public PatientSessionEntity getCurrentSession() {
        d0 c11 = d0.c(0, "SELECT * FROM PatientSession WHERE endTime == 0 ORDER BY startTime DESC LIMIT 1");
        this.__db.b();
        Cursor c12 = b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "id");
            int b11 = a.b(c12, "patientId");
            int b12 = a.b(c12, "startTime");
            int b13 = a.b(c12, "endTime");
            int b14 = a.b(c12, "ecgCount");
            int b15 = a.b(c12, "workoutCount");
            PatientSessionEntity patientSessionEntity = null;
            Long valueOf = null;
            if (c12.moveToFirst()) {
                if (!c12.isNull(b10)) {
                    valueOf = Long.valueOf(c12.getLong(b10));
                }
                patientSessionEntity = new PatientSessionEntity(valueOf, c12.getString(b11), c12.getLong(b12), c12.getLong(b13), c12.getInt(b14), c12.getInt(b15));
            }
            return patientSessionEntity;
        } finally {
            c12.close();
            c11.release();
        }
    }

    @Override // com.withings.clinicalstudy.repository.PatientSessionDao
    public PatientSessionEntity getSession(long j5) {
        d0 c11 = d0.c(2, "SELECT * FROM PatientSession WHERE ? >= startTime AND (? <= endTime OR endTime == 0) ORDER BY startTime DESC LIMIT 1");
        c11.v(1, j5);
        c11.v(2, j5);
        this.__db.b();
        Cursor c12 = b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "id");
            int b11 = a.b(c12, "patientId");
            int b12 = a.b(c12, "startTime");
            int b13 = a.b(c12, "endTime");
            int b14 = a.b(c12, "ecgCount");
            int b15 = a.b(c12, "workoutCount");
            PatientSessionEntity patientSessionEntity = null;
            Long valueOf = null;
            if (c12.moveToFirst()) {
                if (!c12.isNull(b10)) {
                    valueOf = Long.valueOf(c12.getLong(b10));
                }
                patientSessionEntity = new PatientSessionEntity(valueOf, c12.getString(b11), c12.getLong(b12), c12.getLong(b13), c12.getInt(b14), c12.getInt(b15));
            }
            return patientSessionEntity;
        } finally {
            c12.close();
            c11.release();
        }
    }

    @Override // com.withings.clinicalstudy.repository.PatientSessionDao
    public void update(PatientSessionEntity patientSessionEntity) {
        this.__db.b();
        this.__db.c();
        try {
            this.__updateAdapterOfPatientSessionEntity.handle(patientSessionEntity);
            this.__db.z();
        } finally {
            this.__db.h();
        }
    }
}
