package com.withings.device.install.wsm.install;

import aj.b;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.e;
import androidx.compose.foundation.lazy.layout.d;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.device.install.wsm.conversion.WsmAssignmentConversation;
import com.withings.device.setup.ui.SetupWithUser;
import com.withings.device.setup.ui.l;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import fl.p;
import io.i;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.u;
import xp.g;
/* loaded from: classes3.dex */
public class Wsm01Setup implements Setup, Setup.WithOverview, SetupWithUser, Setup.k, Setup.i {
    public static final Parcelable.Creator<Wsm01Setup> CREATOR = new Object();

    /* loaded from: classes3.dex */
    final class a implements Parcelable.Creator<Wsm01Setup> {
        @Override // android.os.Parcelable.Creator
        public final Wsm01Setup createFromParcel(Parcel parcel) {
            return new Wsm01Setup();
        }

        @Override // android.os.Parcelable.Creator
        public final Wsm01Setup[] newArray(int i11) {
            return new Wsm01Setup[i11];
        }
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final Object E() {
        return 2131232435;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final boolean E2(Context context) {
        u.j(context, "context");
        String string = context.getResources().getString(C1987R.string._WSM01_OVERVIEW_LEARN_MORE_URL_);
        u.i(string, "getString(...)");
        if (string.length() == 0 || string.compareTo("&nbsp;") == 0) {
            return true;
        }
        return false;
    }

    @Override // com.withings.devicesetup.Setup
    public final boolean I2() {
        return true;
    }

    @Override // com.withings.devicesetup.Setup
    public final int J() {
        return C1987R.string._WSM01_ACTIVATION_MESSAGE_ACTIVATED_;
    }

    @Override // com.withings.devicesetup.Setup
    public final g J0(SetupActivity setupActivity) {
        d.d().getClass();
        return new eo.a(setupActivity);
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
        return C1987R.string._WSM01_CONNECTION_MESSAGE_INSTRUCTIONS_;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final Intent M1(Context context) {
        u.j(context, "context");
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        String string = context.getString(C1987R.string._STORE_);
        String string2 = context.getString(C1987R.string._WSM01_OVERVIEW_LEARN_MORE_URL_);
        u.i(string2, "getString(...)");
        return aVar.c(context, string, string2);
    }

    @Override // com.withings.devicesetup.Setup
    public final Object N0() {
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final int R() {
        return C1987R.string._WSM01_ACTIVATION_MESSAGE_ACTIVATING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S() {
        return C1987R.string._WSM01_CONNECTION_TITLE_SEARCHING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int S1() {
        return l.a(C1987R.string._WSM01_CONNECTION_MESSAGE_CONNECTING_);
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation V1(SetupConversation setupConversation) {
        return null;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object X0() {
        return 2131232641;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object Z() {
        return 2131232641;
    }

    @Override // com.withings.devicesetup.Setup.i
    public final int c() {
        return 2;
    }

    @Override // com.withings.devicesetup.Setup
    public final Object c1() {
        return 2131232641;
    }

    @Override // com.withings.devicesetup.Setup.i
    public final List<Integer> d() {
        return Arrays.asList(null, null);
    }

    @Override // com.withings.devicesetup.Setup
    public final Object d0() {
        return 2131232642;
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
        return C1987R.string._WSM01_CONNECTION_TITLE_CONNECTING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int f1() {
        return C1987R.string._WSM01_CONNECTION_TITLE_INSTRUCTIONS_;
    }

    @Override // com.withings.devicesetup.Setup.i
    public final int g(int i11, boolean z5) {
        return i11 + 1;
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final int getDeviceType() {
        return 32;
    }

    @Override // com.withings.devicesetup.Setup
    public final WppDeviceConversation h0(SetupConversation setupConversation) {
        return new WsmAssignmentConversation(new i(this, setupConversation));
    }

    @Override // com.withings.devicesetup.Setup.i
    public final Object[] i() {
        return new Object[]{2131232642, 2131232966};
    }

    @Override // com.withings.devicesetup.Setup
    public final int j0() {
        return C1987R.string._WSM01_CONNECTION_TITLE_DETECTED_;
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final boolean j2() {
        return true;
    }

    @Override // com.withings.devicesetup.Setup.i
    public final int[] k() {
        return new int[]{C1987R.string._WSM01_CONNECTION_TITLE_INSTRUCTIONS_, C1987R.string._WSM_INSTALL_PUT_UNDER_MATRESS_};
    }

    @Override // com.withings.devicesetup.Setup.i
    public final int[] l() {
        return new int[]{C1987R.string._WSM01_CONNECTION_MESSAGE_INSTRUCTIONS_, C1987R.string._WSM02_CONNECTION_MESSAGE_INSTRUCTIONS_};
    }

    @Override // com.withings.devicesetup.Setup
    public final int o2() {
        return C1987R.string._WSM01_CONNECTION_MESSAGE_SEARCHING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final void r0(SetupActivity setupActivity) {
        setupActivity.setResult(-1);
        setupActivity.finish();
    }

    @Override // com.withings.devicesetup.Setup
    public final int r2() {
        return C1987R.string._WSM01_CONNECTION_MESSAGE_DETECTED_;
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final int s1() {
        return 0;
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int t0() {
        return C1987R.string._WSM01_OVERVIEW_TITLE_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int v1() {
        return C1987R.string._WSM01_ACTIVATION_TITLE_ACTIVATING_;
    }

    @Override // com.withings.devicesetup.Setup
    public final b w() {
        return e.b(p.f67672b, 60);
    }

    @Override // com.withings.devicesetup.Setup
    public final int w1() {
        if (androidx.core.os.a.b()) {
            return 3;
        }
        return 0;
    }

    @Override // com.withings.devicesetup.Setup
    public final yi.d x(Context context) {
        wi.a aVar;
        u.j(context, "context");
        Object systemService = context.getSystemService("location");
        u.h(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        ui.d dVar = new ui.d(context, (LocationManager) systemService, 0);
        aVar = wi.a.f105219d;
        if (aVar == null) {
            Context applicationContext = context.getApplicationContext();
            u.i(applicationContext, "getApplicationContext(...)");
            aVar = new wi.a(applicationContext);
            wi.a.f105219d = aVar;
        }
        return new wi.e(context, aVar, dVar, 8);
    }

    @Override // com.withings.devicesetup.Setup.WithOverview
    public final int x0() {
        return C1987R.string._WSM01_OVERVIEW_MESSAGE_;
    }

    @Override // com.withings.devicesetup.Setup
    public final int z2() {
        return C1987R.string._WSM01_ACTIVATION_TITLE_ACTIVATED_;
    }

    @Override // com.withings.devicesetup.Setup
    public final void Z1(SetupActivity setupActivity) {
    }

    @Override // com.withings.device.setup.ui.SetupWithUser
    public final void m0(User user) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
    }
}
