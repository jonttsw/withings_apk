package com.withings.wiscale2.device.common.ui;

import com.withings.features.FeatureFlag;
import java.util.List;
/* compiled from: DeviceShortcutsFragment.kt */
/* loaded from: classes5.dex */
public abstract class k2 {

    /* renamed from: d  reason: collision with root package name */
    private static final List<k2> f54011d;

    /* renamed from: a  reason: collision with root package name */
    private final short f54012a;

    /* renamed from: b  reason: collision with root package name */
    private final int f54013b;

    /* renamed from: c  reason: collision with root package name */
    private final int f54014c;

    static {
        List<k2> W;
        if (wr.b.c(FeatureFlag.G)) {
            W = kotlin.collections.x.W(new k1(), new m2(), new t2(), new w(), new n2(), new o2(), new j1(), new c2(), new l1());
        } else {
            W = kotlin.collections.x.W(new k1(), new m2(), new t2(), new w(), new n2(), new o2(), new j1(), new c2());
        }
        f54011d = W;
    }

    public k2(short s11, int i11, int i12) {
        this.f54012a = s11;
        this.f54013b = i11;
        this.f54014c = i12;
    }

    public final int b() {
        return this.f54014c;
    }

    public final int c() {
        return this.f54013b;
    }

    public final short d() {
        return this.f54012a;
    }
}
