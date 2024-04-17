package com.withings.sharing.datasharing;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: DataSharingActivity.kt */
/* loaded from: classes4.dex */
final class b extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DataSharingActivity f44083a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DataSharingActivity dataSharingActivity) {
        super(0);
        this.f44083a = dataSharingActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        this.f44083a.finish();
        return y.f85009a;
    }
}
