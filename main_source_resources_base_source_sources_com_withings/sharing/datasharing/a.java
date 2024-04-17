package com.withings.sharing.datasharing;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: DataSharingActivity.kt */
/* loaded from: classes4.dex */
final class a extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DataSharingActivity f44006a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DataSharingActivity dataSharingActivity) {
        super(0);
        this.f44006a = dataSharingActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        this.f44006a.finish();
        return y.f85009a;
    }
}
