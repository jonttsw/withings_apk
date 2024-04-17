package com.withings.common.device.reporting;

import aj.b;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.common.device.TutorialStateListener;
import com.withings.device.Device;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupStateListener;
import com.withings.library.authentication.api.ConstantsWs;
import fl.p;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.jvm.internal.u;
import nm0.j;
import u70.i;
/* compiled from: InstallStateReporter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/common/device/reporting/InstallStateReporter;", "Lcom/withings/devicesetup/ui/SetupStateListener;", "Lcom/withings/common/device/TutorialStateListener;", "CREATOR", "a", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class InstallStateReporter implements SetupStateListener, TutorialStateListener {
    public static final a CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f35240a;

    /* compiled from: InstallStateReporter.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<InstallStateReporter> {
        @Override // android.os.Parcelable.Creator
        public final InstallStateReporter createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            boolean z5 = true;
            if (parcel.readByte() != 1) {
                z5 = false;
            }
            return new InstallStateReporter(z5);
        }

        @Override // android.os.Parcelable.Creator
        public final InstallStateReporter[] newArray(int i11) {
            return new InstallStateReporter[i11];
        }
    }

    public InstallStateReporter() {
        this(false);
    }

    private final void a(String str, int i11, i iVar) {
        if (this.f35240a) {
            int i12 = v70.a.f103433b;
            v70.a.c(str, s0.j(new j("device_model", String.valueOf(i11)), new j("mac_address", String.valueOf(iVar))), 2);
        }
    }

    @Override // com.withings.common.device.TutorialStateListener
    public final void N(Context context, Device device) {
        u.j(context, "context");
        u.j(device, "device");
    }

    @Override // com.withings.devicesetup.ui.SetupStateListener
    public final void P(Context context, b wppDeviceModel, i iVar) {
        u.j(context, "context");
        u.j(wppDeviceModel, "wppDeviceModel");
        a("device_detected", wppDeviceModel.b(), iVar);
    }

    @Override // com.withings.devicesetup.ui.SetupStateListener
    public final void U1(Context context, b wppDeviceModel) {
        u.j(context, "context");
        u.j(wppDeviceModel, "wppDeviceModel");
        int b10 = wppDeviceModel.b();
        if (this.f35240a) {
            int i11 = v70.a.f103433b;
            v70.a.d("installation", "installation_start", s0.j(new j("flow", "installation"), new j("device_model", Integer.valueOf(p.f67672b.a().i(b10))), new j("id_device", ConstantsWs.PARAMETER_VALUE_NULL)), true);
        }
    }

    @Override // com.withings.devicesetup.ui.SetupStateListener
    public final void b2(WppDeviceConversation wppDeviceConversation) {
        u.j(wppDeviceConversation, "wppDeviceConversation");
        int h11 = wppDeviceConversation.x().h();
        s0.i(new j("device_updated", Boolean.FALSE));
        a("device_up_to_date", h11, wppDeviceConversation.v());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withings.devicesetup.ui.SetupStateListener
    public final void e1(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        a("device_connected", setupConversation.O().w().b(), setupConversation.v());
    }

    @Override // com.withings.devicesetup.ui.SetupStateListener
    public final void g0(SetupConversation setupConversation, boolean z5) {
        if (z5 && setupConversation != null) {
            a("installation_end", setupConversation.O().w().b(), setupConversation.v());
        }
    }

    @Override // com.withings.devicesetup.ui.SetupStateListener
    public final void i0(WppDeviceConversation conversation) {
        u.j(conversation, "conversation");
        int h11 = conversation.x().h();
        s0.i(new j("device_updated", Boolean.TRUE));
        a("device_up_to_date", h11, conversation.v());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        u.j(parcel, "parcel");
        parcel.writeByte(this.f35240a ? (byte) 1 : (byte) 0);
    }

    @Override // com.withings.devicesetup.ui.SetupStateListener
    public final void z1(SetupConversation setupConversation) {
        u.j(setupConversation, "setupConversation");
        a("device_paired", setupConversation.O().w().b(), setupConversation.v());
    }

    public InstallStateReporter(boolean z5) {
        this.f35240a = z5;
    }
}
