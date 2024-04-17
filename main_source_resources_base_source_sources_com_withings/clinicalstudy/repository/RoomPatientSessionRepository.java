package com.withings.clinicalstudy.repository;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
import org.joda.time.DateTime;
import qi.a;
import qm0.d;
/* compiled from: RoomPatientSessionRepository.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/withings/clinicalstudy/repository/RoomPatientSessionRepository;", "Lcom/withings/clinicalstudy/repository/PatientSessionRepository;", "Lcom/withings/clinicalstudy/repository/PatientSessionEntity;", "Lqi/a;", "toPatientSession", "(Lcom/withings/clinicalstudy/repository/PatientSessionEntity;)Lqi/a;", "Lorg/joda/time/DateTime;", "timestamp", "get", "(Lorg/joda/time/DateTime;Lqm0/d;)Ljava/lang/Object;", "patientSession", "Lnm0/y;", DiscoverItems.Item.UPDATE_ACTION, "(Lqi/a;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/clinicalstudy/repository/PatientSessionDao;", "roomPatientSessionDao", "Lcom/withings/clinicalstudy/repository/PatientSessionDao;", "<init>", "(Lcom/withings/clinicalstudy/repository/PatientSessionDao;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RoomPatientSessionRepository implements PatientSessionRepository {
    private final PatientSessionDao roomPatientSessionDao;

    @Inject
    public RoomPatientSessionRepository(PatientSessionDao roomPatientSessionDao) {
        u.j(roomPatientSessionDao, "roomPatientSessionDao");
        this.roomPatientSessionDao = roomPatientSessionDao;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a toPatientSession(PatientSessionEntity patientSessionEntity) {
        DateTime dateTime;
        String patientId = patientSessionEntity.getPatientId();
        DateTime dateTime2 = new DateTime(patientSessionEntity.getStartTime());
        Long valueOf = Long.valueOf(patientSessionEntity.getEndTime());
        if (valueOf.longValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            dateTime = new DateTime(valueOf.longValue());
        } else {
            dateTime = null;
        }
        return new a(patientId, dateTime2, dateTime, patientSessionEntity.getEcgCount(), patientSessionEntity.getWorkoutCount());
    }

    @Override // com.withings.clinicalstudy.repository.PatientSessionRepository
    public Object get(DateTime dateTime, d<? super a> dVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new RoomPatientSessionRepository$get$2(dateTime, this, null), dVar);
    }

    @Override // com.withings.clinicalstudy.repository.PatientSessionRepository
    public Object update(a aVar, d<? super y> dVar) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new RoomPatientSessionRepository$update$2(this, aVar, null), dVar);
        if (withContext == CoroutineSingletons.f76214a) {
            return withContext;
        }
        return y.f85009a;
    }
}
