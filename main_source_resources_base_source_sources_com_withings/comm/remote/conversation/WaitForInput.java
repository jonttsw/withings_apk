package com.withings.comm.remote.conversation;

import com.withings.comm.remote.exception.ConversationTimeoutException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public final class WaitForInput<I> {

    /* renamed from: a  reason: collision with root package name */
    private final cj.b f33134a;

    /* renamed from: b  reason: collision with root package name */
    private final long f33135b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f33136c;

    /* renamed from: d  reason: collision with root package name */
    private final LinkedBlockingQueue f33137d = new LinkedBlockingQueue();

    /* renamed from: e  reason: collision with root package name */
    private I f33138e;

    /* renamed from: f  reason: collision with root package name */
    private long f33139f;

    /* renamed from: g  reason: collision with root package name */
    private long f33140g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f33141h;

    /* loaded from: classes3.dex */
    public static class CancelException extends Exception {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f33142a;

        public CancelException(boolean z5) {
            this.f33142a = z5;
        }

        public final boolean a() {
            return this.f33142a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f33143a;

        public a(boolean z5) {
            this.f33143a = z5;
        }

        @Override // com.withings.comm.remote.conversation.WaitForInput.c
        public final boolean a(WaitForInput waitForInput) throws IOException, ConversationException, CancelException {
            throw new CancelException(this.f33143a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b implements c {
        @Override // com.withings.comm.remote.conversation.WaitForInput.c
        public final boolean a(WaitForInput waitForInput) throws IOException, ConversationException, CancelException {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public interface c {
        boolean a(WaitForInput waitForInput) throws IOException, ConversationException, CancelException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class d implements c {
        @Override // com.withings.comm.remote.conversation.WaitForInput.c
        public final boolean a(WaitForInput waitForInput) throws IOException, ConversationException, CancelException {
            WaitForInput.a(waitForInput);
            return true;
        }
    }

    public WaitForInput(cj.b bVar, long j5, boolean z5, boolean z11) {
        this.f33134a = bVar;
        this.f33135b = j5;
        this.f33136c = z5;
        this.f33141h = z11;
    }

    static void a(WaitForInput waitForInput) {
        waitForInput.getClass();
        waitForInput.f33139f = System.currentTimeMillis();
    }

    private boolean c() throws InterruptedException, CancelException, ConversationException, IOException {
        cj.b bVar = this.f33134a;
        long d11 = bVar.d() - (System.currentTimeMillis() - this.f33140g);
        LinkedBlockingQueue linkedBlockingQueue = this.f33137d;
        long j5 = this.f33135b;
        c cVar = (c) linkedBlockingQueue.poll(Math.min(d11, j5), TimeUnit.MILLISECONDS);
        if (cVar != null) {
            return cVar.a(this);
        }
        if (System.currentTimeMillis() - this.f33139f > j5 && (!this.f33141h || !u70.a.b().e())) {
            if (this.f33136c) {
                throw new ConversationTimeoutException();
            }
            throw new Exception("Time out reached");
        }
        bVar.q();
        this.f33140g = System.currentTimeMillis();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.f33137d.add(new a(this.f33136c));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.f33137d.add(new Object());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(I i11) {
        this.f33138e = i11;
        this.f33137d.add(new Object());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final I f() throws IOException, ConversationException, CancelException, InterruptedException {
        this.f33140g = System.currentTimeMillis();
        this.f33139f = System.currentTimeMillis();
        do {
        } while (c());
        return this.f33138e;
    }
}
