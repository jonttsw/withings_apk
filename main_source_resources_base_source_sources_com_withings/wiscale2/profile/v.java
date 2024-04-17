package com.withings.wiscale2.profile;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
/* compiled from: ProfileFragment.kt */
/* loaded from: classes5.dex */
final class v extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f59468a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(q qVar) {
        super(0);
        this.f59468a = qVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        q qVar = this.f59468a;
        ch.d dVar = qVar.M;
        if (dVar != null) {
            ah.i H = dVar.H();
            Context requireContext = qVar.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            H.getClass();
            Intent className = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(requireContext.getPackageName(), "com.withings.sharing.datasharing.DataSharingActivity");
            kotlin.jvm.internal.u.i(className, "setClassName(...)");
            qVar.startActivity(className);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }
}
