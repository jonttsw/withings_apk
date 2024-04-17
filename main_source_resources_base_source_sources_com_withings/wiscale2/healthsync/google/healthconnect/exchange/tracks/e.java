package com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks;

import android.content.Context;
import com.withings.user.User;
import java.util.List;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import org.joda.time.DateTime;
import ym0.r;
/* compiled from: ExchangeTracksWithHealthConnectRequest.kt */
/* loaded from: classes5.dex */
final class e extends w implements ym0.a<ag0.b> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExchangeTracksWithHealthConnectWorker f56722a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f56723b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, ExchangeTracksWithHealthConnectWorker exchangeTracksWithHealthConnectWorker) {
        super(0);
        this.f56722a = exchangeTracksWithHealthConnectWorker;
        this.f56723b = context;
    }

    @Override // ym0.a
    public final ag0.b invoke() {
        r rVar;
        ExchangeTracksWithHealthConnectWorker exchangeTracksWithHealthConnectWorker = this.f56722a;
        User user = exchangeTracksWithHealthConnectWorker.getUser();
        String packageName = this.f56723b.getPackageName();
        u.i(packageName, "getPackageName(...)");
        DateTime x11 = exchangeTracksWithHealthConnectWorker.x();
        List V = x.V(exchangeTracksWithHealthConnectWorker.m());
        rVar = exchangeTracksWithHealthConnectWorker.f56667l;
        return new ag0.b(user, packageName, x11, V, rVar);
    }
}
