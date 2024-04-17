package com.withings.badge.detail;

import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: BadgeDetailActivity.kt */
/* loaded from: classes3.dex */
final class b extends w implements ym0.l<String, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BadgeDetailActivity f32744a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BadgeDetailActivity badgeDetailActivity) {
        super(1);
        this.f32744a = badgeDetailActivity;
    }

    @Override // ym0.l
    public final y invoke(String str) {
        String it = str;
        u.j(it, "it");
        this.f32744a.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(it)));
        return y.f85009a;
    }
}
