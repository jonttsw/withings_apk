package com.withings.comm.wpp;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xi.a;
/* compiled from: WppConnection.java */
/* loaded from: classes3.dex */
public final class d implements a.InterfaceC1881a {

    /* renamed from: a  reason: collision with root package name */
    private final xi.a f33224a;

    /* renamed from: b  reason: collision with root package name */
    private final List<b> f33225b = Collections.synchronizedList(new ArrayList());

    /* renamed from: c  reason: collision with root package name */
    private boolean f33226c;

    /* compiled from: WppConnection.java */
    /* loaded from: classes3.dex */
    public interface a extends b {
        void e(f fVar);

        void f(byte[] bArr);

        void h(byte[] bArr);

        void k(boolean z5, String str);
    }

    /* compiled from: WppConnection.java */
    /* loaded from: classes3.dex */
    public interface b {
        void i(d dVar);

        void o(d dVar, f fVar);
    }

    public d(xi.a aVar) {
        this.f33224a = aVar;
        aVar.e(this);
    }

    public final void a(List<b> list) {
        this.f33225b.addAll(list);
    }

    public final void b(b bVar) {
        this.f33225b.add(bVar);
    }

    @Override // xi.a.InterfaceC1881a
    public final void c(byte[] bArr) {
        try {
            synchronized (this.f33225b) {
                for (b bVar : this.f33225b) {
                    if (bVar instanceof a) {
                        ((a) bVar).h(bArr);
                    }
                }
            }
            f a11 = i.a(bArr);
            synchronized (this.f33225b) {
                for (b bVar2 : this.f33225b) {
                    bVar2.o(this, a11);
                }
            }
        } catch (Exception e11) {
            x70.b.f(this, e11, "Unable to parse received data", new Object[0]);
            x70.b.p(e11);
        }
    }

    @Override // xi.a.InterfaceC1881a
    public final void d() {
        synchronized (this.f33225b) {
            try {
                for (b bVar : this.f33225b) {
                    bVar.i(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        this.f33225b.removeIf(new Object());
    }

    public final void f() throws IOException {
        this.f33224a.close();
    }

    public final xi.a g() {
        return this.f33224a;
    }

    public final ArrayList h() {
        return new ArrayList(this.f33225b);
    }

    public final void i(b bVar) {
        this.f33225b.remove(bVar);
    }

    public final void j(f fVar) throws IOException {
        short s11 = 0;
        for (h hVar : fVar.d()) {
            s11 = (short) (hVar.getSize() + s11);
        }
        ByteBuffer allocate = ByteBuffer.allocate(s11);
        for (h hVar2 : fVar.d()) {
            allocate.putShort(hVar2.getType());
            allocate.put(hVar2.toByteArray());
        }
        byte f11 = fVar.f();
        short e11 = fVar.e();
        int capacity = allocate.capacity();
        ByteBuffer allocate2 = ByteBuffer.allocate(capacity + 5);
        allocate2.put(f11);
        allocate2.putShort(e11);
        allocate2.putShort((short) capacity);
        allocate2.put(allocate.array());
        k(allocate2.array());
        synchronized (this.f33225b) {
            try {
                for (b bVar : this.f33225b) {
                    if (bVar instanceof a) {
                        ((a) bVar).e(fVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(byte[] bArr) throws IOException {
        this.f33224a.b(bArr);
        synchronized (this.f33225b) {
            try {
                for (b bVar : this.f33225b) {
                    if (bVar instanceof a) {
                        ((a) bVar).f(bArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(String str, boolean z5) {
        if (this.f33226c != z5) {
            this.f33226c = z5;
            synchronized (this.f33225b) {
                try {
                    for (b bVar : this.f33225b) {
                        if (bVar instanceof a) {
                            ((a) bVar).k(z5, str);
                        }
                    }
                } finally {
                }
            }
        }
    }
}
