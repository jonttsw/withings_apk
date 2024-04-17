package com.withings.device.details.wsm;

import android.widget.Toast;
import androidx.compose.ui.platform.l1;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: Wsm02DetailFragment.kt */
/* loaded from: classes3.dex */
final class e extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l1 f37317a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ i f37318b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l1 l1Var, i iVar) {
        super(0);
        this.f37317a = l1Var;
        this.f37318b = iVar;
    }

    @Override // ym0.a
    public final y invoke() {
        i iVar = this.f37318b;
        String iVar2 = iVar.A1().getMacAddress().toString();
        u.i(iVar2, "toString(...)");
        this.f37317a.c(new androidx.compose.ui.text.b(iVar2, null, 6));
        Toast.makeText(iVar.getContext(), (int) C1987R.string._MAC_COPIED_TO_CLIPBOARD_, 0).show();
        return y.f85009a;
    }
}
