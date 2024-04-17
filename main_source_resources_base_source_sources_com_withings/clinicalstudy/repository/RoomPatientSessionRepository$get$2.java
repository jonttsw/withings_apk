package com.withings.clinicalstudy.repository;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import qi.a;
import qm0.d;
import ym0.p;
/* compiled from: RoomPatientSessionRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lqi/a;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lqi/a;"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.clinicalstudy.repository.RoomPatientSessionRepository$get$2", f = "RoomPatientSessionRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RoomPatientSessionRepository$get$2 extends i implements p<CoroutineScope, d<? super a>, Object> {
    final /* synthetic */ DateTime $timestamp;
    int label;
    final /* synthetic */ RoomPatientSessionRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomPatientSessionRepository$get$2(DateTime dateTime, RoomPatientSessionRepository roomPatientSessionRepository, d<? super RoomPatientSessionRepository$get$2> dVar) {
        super(2, dVar);
        this.$timestamp = dateTime;
        this.this$0 = roomPatientSessionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new RoomPatientSessionRepository$get$2(this.$timestamp, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        PatientSessionDao patientSessionDao;
        a patientSession;
        PatientSessionDao patientSessionDao2;
        a patientSession2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            if (this.$timestamp != null) {
                patientSessionDao2 = this.this$0.roomPatientSessionDao;
                PatientSessionEntity session = patientSessionDao2.getSession(this.$timestamp.getMillis());
                if (session != null) {
                    patientSession2 = this.this$0.toPatientSession(session);
                    return patientSession2;
                }
                return null;
            }
            patientSessionDao = this.this$0.roomPatientSessionDao;
            PatientSessionEntity currentSession = patientSessionDao.getCurrentSession();
            if (currentSession != null) {
                patientSession = this.this$0.toPatientSession(currentSession);
                return patientSession;
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super a> dVar) {
        return ((RoomPatientSessionRepository$get$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
