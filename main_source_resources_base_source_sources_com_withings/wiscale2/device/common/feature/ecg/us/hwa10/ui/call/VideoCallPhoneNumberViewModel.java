package com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call;

import androidx.fragment.app.o;
import androidx.lifecycle.g1;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.withings.ecg.webservices.EcgReviewRemoteRepository;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.y;
/* compiled from: VideoCallPhoneNumberScreen.kt */
/* loaded from: classes5.dex */
public final class VideoCallPhoneNumberViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final long f51830a;

    /* renamed from: b  reason: collision with root package name */
    private final long f51831b;

    /* renamed from: c  reason: collision with root package name */
    private final MutableStateFlow<String> f51832c;

    /* renamed from: d  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f51833d;

    /* renamed from: e  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f51834e;

    /* renamed from: f  reason: collision with root package name */
    private final MutableSharedFlow<Error> f51835f;

    /* renamed from: g  reason: collision with root package name */
    private final MutableSharedFlow<y> f51836g;

    /* renamed from: h  reason: collision with root package name */
    private final EcgReviewRemoteRepository f51837h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoCallPhoneNumberScreen.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/ecg/us/hwa10/ui/call/VideoCallPhoneNumberViewModel$Error;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class Error {

        /* renamed from: a  reason: collision with root package name */
        public static final Error f51838a;

        /* renamed from: b  reason: collision with root package name */
        public static final Error f51839b;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ Error[] f51840c;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallPhoneNumberViewModel$Error] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallPhoneNumberViewModel$Error] */
        static {
            ?? r02 = new Enum("Unauthorized", 0);
            f51838a = r02;
            ?? r12 = new Enum(DeviceInfo.STR_TYPE_UNKNOWN, 1);
            f51839b = r12;
            Error[] errorArr = {r02, r12};
            f51840c = errorArr;
            sm0.b.a(errorArr);
        }

        private Error() {
            throw null;
        }

        public static Error valueOf(String str) {
            return (Error) Enum.valueOf(Error.class, str);
        }

        public static Error[] values() {
            return (Error[]) f51840c.clone();
        }
    }

    public VideoCallPhoneNumberViewModel(long j5, long j11, EcgReviewRemoteRepository ecgReviewRemoteRepository) {
        u.j(ecgReviewRemoteRepository, "ecgReviewRemoteRepository");
        this.f51830a = j5;
        this.f51831b = j11;
        this.f51832c = StateFlowKt.MutableStateFlow(null);
        Boolean bool = Boolean.FALSE;
        this.f51833d = StateFlowKt.MutableStateFlow(bool);
        this.f51834e = StateFlowKt.MutableStateFlow(bool);
        this.f51835f = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f51836g = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f51837h = ecgReviewRemoteRepository.withSyncContext("view_video_call_phone_number");
    }

    public static final String i0(VideoCallPhoneNumberViewModel videoCallPhoneNumberViewModel) {
        String value = videoCallPhoneNumberViewModel.f51832c.getValue();
        String str = "";
        if (value == null) {
            value = "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < value.length(); i11++) {
            char charAt = value.charAt(i11);
            if (!fk.y.e().contains(Character.valueOf(charAt))) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        u.i(sb3, "toString(...)");
        String valueOf = String.valueOf(PhoneNumberUtil.i().g(Locale.US.getCountry()));
        if (!dp0.j.R(sb3, valueOf, false)) {
            str = valueOf;
        }
        return o.d("+", str, sb3);
    }

    public final MutableStateFlow<String> k0() {
        return this.f51832c;
    }

    public final MutableSharedFlow<Error> m0() {
        return this.f51835f;
    }

    public final MutableSharedFlow<y> p0() {
        return this.f51836g;
    }

    public final MutableStateFlow<Boolean> q0() {
        return this.f51833d;
    }

    public final MutableStateFlow<Boolean> r0() {
        return this.f51834e;
    }
}
