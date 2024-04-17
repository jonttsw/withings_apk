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
/* compiled from: VideoCallCodeCheckScreen.kt */
/* loaded from: classes5.dex */
public final class VideoCallCodeCheckViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final long f51816a;

    /* renamed from: b  reason: collision with root package name */
    private final long f51817b;

    /* renamed from: c  reason: collision with root package name */
    private final String f51818c;

    /* renamed from: d  reason: collision with root package name */
    private final MutableStateFlow<String> f51819d;

    /* renamed from: e  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f51820e;

    /* renamed from: f  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f51821f;

    /* renamed from: g  reason: collision with root package name */
    private final MutableSharedFlow<Error> f51822g;

    /* renamed from: h  reason: collision with root package name */
    private final MutableSharedFlow<y> f51823h;

    /* renamed from: i  reason: collision with root package name */
    private final MutableSharedFlow<y> f51824i;

    /* renamed from: j  reason: collision with root package name */
    private final EcgReviewRemoteRepository f51825j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoCallCodeCheckScreen.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/ecg/us/hwa10/ui/call/VideoCallCodeCheckViewModel$Error;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class Error {

        /* renamed from: a  reason: collision with root package name */
        public static final Error f51826a;

        /* renamed from: b  reason: collision with root package name */
        public static final Error f51827b;

        /* renamed from: c  reason: collision with root package name */
        public static final Error f51828c;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ Error[] f51829d;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallCodeCheckViewModel$Error] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallCodeCheckViewModel$Error] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallCodeCheckViewModel$Error] */
        static {
            ?? r02 = new Enum("Unauthorized", 0);
            f51826a = r02;
            ?? r12 = new Enum(DeviceInfo.STR_TYPE_UNKNOWN, 1);
            f51827b = r12;
            ?? r22 = new Enum("CodeResentFail", 2);
            f51828c = r22;
            Error[] errorArr = {r02, r12, r22};
            f51829d = errorArr;
            sm0.b.a(errorArr);
        }

        private Error() {
            throw null;
        }

        public static Error valueOf(String str) {
            return (Error) Enum.valueOf(Error.class, str);
        }

        public static Error[] values() {
            return (Error[]) f51829d.clone();
        }
    }

    public VideoCallCodeCheckViewModel(long j5, long j11, String phoneNumber, EcgReviewRemoteRepository ecgReviewRemoteRepository) {
        u.j(phoneNumber, "phoneNumber");
        u.j(ecgReviewRemoteRepository, "ecgReviewRemoteRepository");
        this.f51816a = j5;
        this.f51817b = j11;
        this.f51818c = phoneNumber;
        this.f51819d = StateFlowKt.MutableStateFlow(null);
        Boolean bool = Boolean.FALSE;
        this.f51820e = StateFlowKt.MutableStateFlow(bool);
        this.f51821f = StateFlowKt.MutableStateFlow(bool);
        this.f51822g = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f51823h = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f51824i = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f51825j = ecgReviewRemoteRepository.withSyncContext("view_video_call_code_check");
    }

    public static final String f0(VideoCallCodeCheckViewModel videoCallCodeCheckViewModel) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            String str = videoCallCodeCheckViewModel.f51818c;
            if (i11 >= str.length()) {
                break;
            }
            char charAt = str.charAt(i11);
            if (!fk.y.e().contains(Character.valueOf(charAt))) {
                sb2.append(charAt);
            }
            i11++;
        }
        String sb3 = sb2.toString();
        u.i(sb3, "toString(...)");
        String valueOf = String.valueOf(PhoneNumberUtil.i().g(Locale.US.getCountry()));
        if (dp0.j.R(sb3, valueOf, false)) {
            valueOf = "";
        }
        return o.d("+", valueOf, sb3);
    }

    public final MutableSharedFlow<Error> k0() {
        return this.f51822g;
    }

    public final MutableSharedFlow<y> m0() {
        return this.f51823h;
    }

    public final MutableSharedFlow<y> p0() {
        return this.f51824i;
    }

    public final String q0() {
        return this.f51818c;
    }

    public final MutableStateFlow<String> r0() {
        return this.f51819d;
    }

    public final MutableStateFlow<Boolean> t0() {
        return this.f51820e;
    }

    public final MutableStateFlow<Boolean> y0() {
        return this.f51821f;
    }
}
