package com.withings.ecg.details;

import androidx.lifecycle.LiveData;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.ecg.webservices.EcgReviewRemoteRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
/* compiled from: EcgInReviewViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/ecg/details/EcgInReviewViewModel;", "Landroidx/lifecycle/g1;", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class EcgInReviewViewModel extends androidx.lifecycle.g1 {

    /* renamed from: a  reason: collision with root package name */
    private final r70.c f37998a;

    /* renamed from: b  reason: collision with root package name */
    private final rq.f f37999b;

    /* renamed from: c  reason: collision with root package name */
    private final EcgReviewRemoteRepository f38000c;

    /* renamed from: d  reason: collision with root package name */
    private final kn.e f38001d;

    /* renamed from: e  reason: collision with root package name */
    private final HeartSignalRepository f38002e;

    /* renamed from: f  reason: collision with root package name */
    private final long f38003f;

    /* renamed from: g  reason: collision with root package name */
    private final Long f38004g;

    /* renamed from: h  reason: collision with root package name */
    private final Flow<rq.b> f38005h;

    /* renamed from: i  reason: collision with root package name */
    private final SharedFlow f38006i;

    /* renamed from: j  reason: collision with root package name */
    private final Flow<rq.b> f38007j;

    /* JADX WARN: Type inference failed for: r5v2, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r5v5, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
    @Inject
    public EcgInReviewViewModel(r70.c userRepository, rq.f fVar, EcgReviewRemoteRepository ecgReviewRemoteRepository, kn.e deviceManager, HeartSignalRepository heartSignalRepository, sq.f fVar2, androidx.lifecycle.u0 savedStateHandle) {
        kotlin.jvm.internal.u.j(userRepository, "userRepository");
        kotlin.jvm.internal.u.j(ecgReviewRemoteRepository, "ecgReviewRemoteRepository");
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        kotlin.jvm.internal.u.j(heartSignalRepository, "heartSignalRepository");
        kotlin.jvm.internal.u.j(savedStateHandle, "savedStateHandle");
        this.f37998a = userRepository;
        this.f37999b = fVar;
        this.f38000c = ecgReviewRemoteRepository;
        this.f38001d = deviceManager;
        this.f38002e = heartSignalRepository;
        Object c11 = savedStateHandle.c(HealthUserProfile.USER_PROFILE_KEY_USER_ID);
        kotlin.jvm.internal.u.g(c11);
        this.f38003f = ((Number) c11).longValue();
        this.f38004g = (Long) savedStateHandle.c("device_id");
        Object c12 = savedStateHandle.c("ecg_id");
        kotlin.jvm.internal.u.g(c12);
        LiveData<HeartSignalMeasurement> heartSignalLiveData = heartSignalRepository.getHeartSignalLiveData(((Number) c12).longValue());
        Flow<rq.b> a11 = androidx.lifecycle.q.a(new xw.p(new a2(heartSignalLiveData, fVar2), androidx.lifecycle.e1.c(heartSignalLiveData, new k1(this)), h1.f38233a));
        this.f38005h = a11;
        SharedFlow shareIn = FlowKt.shareIn(FlowKt.flowOn(FlowKt.onEmpty(FlowKt.flow(new f1(this, null)), new kotlin.coroutines.jvm.internal.i(2, null)), Dispatchers.getIO()), androidx.lifecycle.h1.a(this), SharingStarted.Companion.getLazily(), 1);
        this.f38006i = shareIn;
        this.f38007j = FlowKt.flowCombine(shareIn, a11, new kotlin.coroutines.jvm.internal.i(3, null));
    }

    public final Flow<rq.b> p0() {
        return this.f38007j;
    }

    public final long q0() {
        return this.f38003f;
    }
}
