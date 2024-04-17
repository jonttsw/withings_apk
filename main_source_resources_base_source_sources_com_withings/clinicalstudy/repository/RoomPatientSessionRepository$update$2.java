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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.clinicalstudy.repository.RoomPatientSessionRepository$update$2", f = "RoomPatientSessionRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RoomPatientSessionRepository$update$2 extends i implements p<CoroutineScope, d<? super y>, Object> {
    final /* synthetic */ a $patientSession;
    int label;
    final /* synthetic */ RoomPatientSessionRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomPatientSessionRepository$update$2(RoomPatientSessionRepository roomPatientSessionRepository, a aVar, d<? super RoomPatientSessionRepository$update$2> dVar) {
        super(2, dVar);
        this.this$0 = roomPatientSessionRepository;
        this.$patientSession = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new RoomPatientSessionRepository$update$2(this.this$0, this.$patientSession, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        PatientSessionDao patientSessionDao;
        Long l5;
        long j5;
        PatientSessionDao patientSessionDao2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            patientSessionDao = this.this$0.roomPatientSessionDao;
            PatientSessionEntity session = patientSessionDao.getSession(this.$patientSession.e().getMillis());
            if (session != null) {
                l5 = session.getId();
            } else {
                l5 = null;
            }
            Long l6 = l5;
            String d11 = this.$patientSession.d();
            long millis = this.$patientSession.e().getMillis();
            DateTime c11 = this.$patientSession.c();
            if (c11 != null) {
                j5 = c11.getMillis();
            } else {
                j5 = 0;
            }
            PatientSessionEntity patientSessionEntity = new PatientSessionEntity(l6, d11, millis, j5, this.$patientSession.b(), this.$patientSession.f());
            patientSessionDao2 = this.this$0.roomPatientSessionDao;
            patientSessionDao2.update(patientSessionEntity);
            return y.f85009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((RoomPatientSessionRepository$update$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
