package com.withings.wiscale2.device.wam;

import android.os.Handler;
import android.os.Looper;
import com.withings.comm.remote.exception.RestartBluetoothException;
import com.withings.common.device.i;
import ej.w;
import ge0.e;
import ge0.f;
import gj.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.UUID;
import wi.c;
import xp.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wam01SetupDiscoverer.java */
/* loaded from: classes5.dex */
public final class b implements g, i {

    /* renamed from: a  reason: collision with root package name */
    private final g.a f54828a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList f54829b;

    /* renamed from: c  reason: collision with root package name */
    private a f54830c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f54831d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f54832e = new Handler(Looper.getMainLooper());

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList f54833f = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(g.a aVar) {
        this.f54828a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(b bVar) {
        boolean isEmpty = bVar.f54829b.isEmpty();
        g.a aVar = bVar.f54828a;
        if (isEmpty) {
            aVar.L1(new RestartBluetoothException());
        } else {
            aVar.H2();
        }
        ArrayList arrayList = bVar.f54833f;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w.w().L((d) it.next());
        }
        arrayList.clear();
        w.w().K(bVar.f54830c);
        Collections.sort(bVar.f54829b, bVar.f54830c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(b bVar) {
        bVar.getClass();
        w.w().K(bVar.f54830c);
        bVar.f54831d = false;
    }

    @Override // xp.g
    public final void d() {
        start();
    }

    @Override // xp.g
    public final void start() {
        this.f54829b = new ArrayList();
        this.f54830c = new a();
        w.w().o(this.f54830c);
        this.f54831d = true;
        this.f54832e.postDelayed(new com.withings.wiscale2.device.wam.a(this), 40000L);
        for (UUID uuid : e.f68947b) {
            f fVar = new f(uuid, this.f54828a, this);
            this.f54833f.add(fVar);
            w.w().n(fVar);
        }
    }

    @Override // xp.g
    public final void stop() {
        ArrayList arrayList = this.f54833f;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w.w().L((d) it.next());
        }
        arrayList.clear();
        if (this.f54831d) {
            w.w().K(this.f54830c);
            this.f54831d = false;
        }
        this.f54832e.removeCallbacksAndMessages(null);
    }

    @Override // com.withings.common.device.i
    public final void c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Wam01SetupDiscoverer.java */
    /* loaded from: classes5.dex */
    public class a implements gj.i<c>, Comparator<c> {
        a() {
        }

        @Override // gj.i
        public final Class<c> b() {
            return c.class;
        }

        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            return -Integer.valueOf(cVar.d()).compareTo(Integer.valueOf(cVar2.d()));
        }

        @Override // gj.i
        public final void e(xi.b bVar) {
            c cVar = (c) bVar;
            if (jl.a.e(cVar, 51)) {
                b bVar2 = b.this;
                if (!bVar2.f54829b.contains(cVar) && gj.e.a(cVar)) {
                    bVar2.f54829b.add(cVar);
                    bVar2.f54828a.Z1(cVar);
                }
            }
        }

        @Override // gj.i
        public final boolean g() {
            return false;
        }

        @Override // gj.i
        public final void a(yi.d dVar, int i11) {
        }
    }
}
