package com.withings.clinicalstudy.repository;

import kotlin.Metadata;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
/* compiled from: RoomPatientSessionDao.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/withings/clinicalstudy/repository/PatientSessionDao;", "", "Lcom/withings/clinicalstudy/repository/PatientSessionEntity;", "patient", "Lnm0/y;", DiscoverItems.Item.UPDATE_ACTION, "(Lcom/withings/clinicalstudy/repository/PatientSessionEntity;)V", "", "timestamp", "getSession", "(J)Lcom/withings/clinicalstudy/repository/PatientSessionEntity;", "getCurrentSession", "()Lcom/withings/clinicalstudy/repository/PatientSessionEntity;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface PatientSessionDao {
    PatientSessionEntity getCurrentSession();

    PatientSessionEntity getSession(long j5);

    void update(PatientSessionEntity patientSessionEntity);
}
