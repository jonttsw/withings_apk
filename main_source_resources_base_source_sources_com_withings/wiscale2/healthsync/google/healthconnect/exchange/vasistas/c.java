package com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas;

import android.content.Context;
import androidx.health.connect.client.records.Record;
import java.util.List;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import org.joda.time.DateTime;
import ym0.q;
/* compiled from: ExchangeVasistasWithHealthConnectRequest.kt */
/* loaded from: classes5.dex */
final class c extends w implements ym0.a<bg0.a> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f56799a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ExchangeVasistasWithHealthConnectWorker<Record> f56800b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, ExchangeVasistasWithHealthConnectWorker<Record> exchangeVasistasWithHealthConnectWorker) {
        super(0);
        this.f56799a = context;
        this.f56800b = exchangeVasistasWithHealthConnectWorker;
    }

    @Override // ym0.a
    public final bg0.a invoke() {
        q qVar;
        String packageName = this.f56799a.getPackageName();
        u.i(packageName, "getPackageName(...)");
        ExchangeVasistasWithHealthConnectWorker<Record> exchangeVasistasWithHealthConnectWorker = this.f56800b;
        DateTime x11 = exchangeVasistasWithHealthConnectWorker.x();
        List V = x.V(exchangeVasistasWithHealthConnectWorker.m());
        qVar = ((ExchangeVasistasWithHealthConnectWorker) exchangeVasistasWithHealthConnectWorker).f56746i;
        return new bg0.a(packageName, x11, V, qVar);
    }
}
