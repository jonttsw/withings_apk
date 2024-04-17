package com.withings.authentication;

import ah.j;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.features.InternalSetting;
import com.withings.features.TestSetting;
import java.util.ArrayList;
/* compiled from: AuthenticationActivity.kt */
/* loaded from: classes3.dex */
final class s0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AuthenticationActivity f32336a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f32337b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(AuthenticationActivity authenticationActivity, Context context) {
        super(0);
        this.f32336a = authenticationActivity;
        this.f32337b = context;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        AuthenticationActivity authenticationActivity = this.f32336a;
        ch.d dVar = authenticationActivity.f31295h;
        if (dVar != null) {
            ((ah.j) dVar.G()).getClass();
            Context context = this.f32337b;
            kotlin.jvm.internal.u.j(context, "context");
            ArrayList n02 = kotlin.collections.x.n0(j.a.f782a, ((kotlin.collections.a) j.a.f783b).toArray(new InternalSetting[0]));
            TestSetting[] testSettingArr = (TestSetting[]) ((kotlin.collections.a) j.a.f784c).toArray(new TestSetting[0]);
            Intent putExtra = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(context.getPackageName(), "com.withings.wiscale2.features.FeatureFlagsActivity").putExtra("Feature flags", "Feature flags").putExtra("list", kotlin.collections.x.n0(n02, new TestSetting[0]));
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            authenticationActivity.startActivity(putExtra);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }
}
