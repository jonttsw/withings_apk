package com.withings.wiscale2.device.sct01;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.e;
import androidx.compose.material3.k4;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.wiscale2.C1987R;
import de0.q;
import fl.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import nm0.g;
import nm0.h;
import yi.d;
/* compiled from: Sct01NetworkSetup.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/sct01/Sct01NetworkSetup;", "Lcom/withings/devicesetup/Setup;", "Lcom/withings/devicesetup/Setup$j;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Sct01NetworkSetup implements Setup, Setup.j {
    public static final Parcelable.Creator<Sct01NetworkSetup> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final g f54772a = h.b(c.f54775a);

    /* renamed from: b  reason: collision with root package name */
    private final g f54773b = h.b(b.f54774a);

    /* compiled from: Sct01NetworkSetup.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Sct01NetworkSetup> {
        @Override // android.os.Parcelable.Creator
        public final Sct01NetworkSetup createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            parcel.readInt();
            return new Sct01NetworkSetup();
        }

        @Override // android.os.Parcelable.Creator
        public final Sct01NetworkSetup[] newArray(int i11) {
            return new Sct01NetworkSetup[i11];
        }
    }

    /* compiled from: Sct01NetworkSetup.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<de0.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f54774a = new w(0);

        /* JADX WARN: Type inference failed for: r1v0, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
        @Override // ym0.a
        public final de0.a invoke() {
            Object runBlocking$default;
            runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new i(2, null), 1, null);
            return new de0.a(((Number) runBlocking$default).intValue());
        }
    }

    /* compiled from: Sct01NetworkSetup.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.a<q> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f54775a = new w(0);

        @Override // ym0.a
        public final q invoke() {
            return new q();
        }
    }

    private final q a() {
        return (q) this.f54772a.getValue();
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return a().f37572u;
    }

    @Override // com.withings.devicesetup.Setup
    public final xp.g J0(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        ej.w w11 = ej.w.w();
        u.i(w11, "get(...)");
        return new com.withings.common.device.b(w11, setupActivity, 70);
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean J1() {
        return true;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean L() {
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final int M() {
        return a().f37556e;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object N0() {
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return a().f37570s;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return a().f37557f;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        return a().f37574w;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation V1(SetupConversation setupConversation) {
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object X0() {
        return 2131231283;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object Z() {
        return 2131231280;
    }

    @Override // com.withings.devicesetup.Setup
    public final /* bridge */ /* synthetic */ Object c1() {
        return 2131231283;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object d0() {
        return Integer.valueOf(((de0.a) this.f54773b.getValue()).a());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withings.devicesetup.Setup
    public final int e0() {
        return C1987R.string._DONE_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int e2() {
        return a().f37573v;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return a().f37555d;
    }

    @Override // com.withings.devicesetup.Setup.j
    public final List<Integer> h() {
        return x.W(2, 1);
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return a().f37559h;
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return a().f37558g;
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        k4.e(setupActivity, "setupActivity", -1);
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return a().f37560i;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return a().f37569r;
    }

    @Override // com.withings.devicesetup.Setup
    public final aj.b w() {
        return e.b(p.f67672b, 70);
    }

    @Override // com.withings.devicesetup.Setup
    public final int w1() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeInt(1);
    }

    @Override // com.withings.devicesetup.Setup
    public final d x(Context context) {
        u.j(context, "context");
        return uc0.e.a(context);
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return a().f37571t;
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
    }
}
