package com.withings.wiscale2.measure.heartrate;

import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HeartRateHandler.java */
/* loaded from: classes5.dex */
public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeartRateHandler f58487a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(HeartRateHandler heartRateHandler) {
        this.f58487a = heartRateHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicBoolean atomicBoolean;
        HeartRateHandler heartRateHandler = this.f58487a;
        atomicBoolean = heartRateHandler.f58476y;
        atomicBoolean.set(true);
        HeartRateHandler.b(heartRateHandler);
    }
}
