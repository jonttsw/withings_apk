package com.withings.wiscale2.device.wpm.conversation;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.wpp.d;
import com.withings.comm.wpp.f;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.generated.object.WpmBpPulse;
import com.withings.comm.wpp.generated.object.WpmResult;
import com.withings.comm.wpp.h;
import java.io.IOException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
/* compiled from: WpmMeasureExchange.java */
/* loaded from: classes5.dex */
public final class b implements d.b {

    /* renamed from: a  reason: collision with root package name */
    private int f55602a;

    /* renamed from: b  reason: collision with root package name */
    private a f55603b;

    /* renamed from: c  reason: collision with root package name */
    private WpmBpPulse f55604c;

    /* renamed from: e  reason: collision with root package name */
    private cj.b f55606e;

    /* renamed from: f  reason: collision with root package name */
    private Semaphore f55607f;

    /* renamed from: d  reason: collision with root package name */
    private WpmResult f55605d = null;

    /* renamed from: g  reason: collision with root package name */
    private boolean f55608g = true;

    /* renamed from: h  reason: collision with root package name */
    private boolean f55609h = false;

    /* compiled from: WpmMeasureExchange.java */
    /* loaded from: classes5.dex */
    public interface a {
    }

    public b(a aVar) {
        this.f55603b = aVar;
    }

    public final void a(WpmMeasureConversation wpmMeasureConversation) throws WaitForInput.CancelException, IOException, ConversationException, InterruptedException {
        cj.b x11 = wpmMeasureConversation.x();
        this.f55606e = x11;
        x11.k().b(this);
        this.f55606e.k().j(new f((byte) 1, (short) 1889, new h[0]));
        this.f55606e.k().j(new f((byte) 1, (short) Wpp.CMD_WPM_KEEPALIVE, new h[0]));
        this.f55607f = new Semaphore(0);
        this.f55602a = 0;
        while (this.f55608g) {
            if (this.f55607f.tryAcquire(1L, TimeUnit.SECONDS)) {
                if (!this.f55609h) {
                    this.f55606e.k().j(new f((byte) 1, (short) Wpp.CMD_WPM_STOP, new h[0]));
                }
                this.f55608g = false;
            } else {
                this.f55606e.k().j(new f((byte) 1, (short) Wpp.CMD_WPM_KEEPALIVE, new h[0]));
                this.f55608g = true;
            }
        }
        this.f55606e.k().i(this);
    }

    public final void b() {
        Semaphore semaphore = this.f55607f;
        if (semaphore != null) {
            semaphore.release();
        }
        this.f55602a = 2;
    }

    public final void c() throws IOException {
        this.f55602a = 1;
        this.f55609h = true;
        this.f55606e.k().j(new f((byte) 1, (short) Wpp.CMD_WPM_STOP, new h[0]));
    }

    @Override // com.withings.comm.wpp.d.b
    public final void i(d dVar) {
        this.f55607f.release();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fc, code lost:
        if (r7 > 1.0f) goto L34;
     */
    @Override // com.withings.comm.wpp.d.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(com.withings.comm.wpp.d r7, com.withings.comm.wpp.f r8) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.wpm.conversation.b.o(com.withings.comm.wpp.d, com.withings.comm.wpp.f):void");
    }
}
