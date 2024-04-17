package com.withings.comm.remote.conversation;

import android.content.Context;
import cj.c;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.exception.ConversationCanceledException;
import com.withings.comm.wpp.exception.BusyCommandException;
import ej.f;
import ej.w;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import vb0.i;
/* loaded from: classes3.dex */
public abstract class WppDeviceConversation {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<WppDeviceConversation> f33144a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<WaitForInput> f33145b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    private AtomicReference<State> f33146c = new AtomicReference<>(State.f33149a);

    /* renamed from: d  reason: collision with root package name */
    private f f33147d;

    /* renamed from: e  reason: collision with root package name */
    private w.d f33148e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class State {

        /* renamed from: a  reason: collision with root package name */
        public static final State f33149a;

        /* renamed from: b  reason: collision with root package name */
        public static final State f33150b;

        /* renamed from: c  reason: collision with root package name */
        public static final State f33151c;

        /* renamed from: d  reason: collision with root package name */
        public static final State f33152d;

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ State[] f33153e;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.comm.remote.conversation.WppDeviceConversation$State] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.comm.remote.conversation.WppDeviceConversation$State] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.comm.remote.conversation.WppDeviceConversation$State] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.comm.remote.conversation.WppDeviceConversation$State] */
        static {
            ?? r02 = new Enum("PENDING", 0);
            f33149a = r02;
            ?? r12 = new Enum("RUNNING", 1);
            f33150b = r12;
            ?? r22 = new Enum("CANCELLED", 2);
            f33151c = r22;
            ?? r32 = new Enum("FINISHED", 3);
            f33152d = r32;
            f33153e = new State[]{r02, r12, r22, r32};
        }

        private State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f33153e.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [C] */
    /* loaded from: classes3.dex */
    public final class a<C> implements u70.b<C> {
        @Override // u70.b
        public final /* bridge */ /* synthetic */ boolean isMatching(Object obj) {
            WppDeviceConversation wppDeviceConversation = (WppDeviceConversation) obj;
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void e3(WppDeviceConversation wppDeviceConversation, Exception exc);
    }

    public final void B(long j5, boolean z5, boolean z11) {
        this.f33145b.set(new WaitForInput(this.f33147d.v(), j5, z5, z11));
    }

    public final void C() {
        WaitForInput waitForInput = this.f33145b.get();
        if (waitForInput != null) {
            waitForInput.d();
        }
    }

    public abstract void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException;

    public final void E(WppDeviceConversation wppDeviceConversation) throws WaitForInput.CancelException, ConversationException, IOException, InterruptedException {
        AtomicReference<WppDeviceConversation> atomicReference = this.f33144a;
        atomicReference.set(wppDeviceConversation);
        if (this.f33146c.get() == State.f33151c) {
            wppDeviceConversation.p();
        }
        wppDeviceConversation.f33147d = this.f33147d;
        wppDeviceConversation.f33148e = this.f33148e;
        wppDeviceConversation.J();
        atomicReference.set(null);
    }

    public final void F(f fVar) {
        this.f33147d = fVar;
    }

    public final void G(Object obj) {
        this.f33145b.get().e(obj);
    }

    public final void I(w.d dVar) {
        this.f33148e = dVar;
    }

    public final void J() throws IOException, ConversationException, InterruptedException {
        State state = State.f33151c;
        AtomicReference<State> atomicReference = this.f33146c;
        atomicReference.set(State.f33150b);
        try {
            D();
            atomicReference.set(State.f33152d);
        } catch (WaitForInput.CancelException e11) {
            atomicReference.set(state);
            if (!e11.a()) {
                return;
            }
            throw new ConversationCanceledException();
        } catch (BusyCommandException unused) {
            atomicReference.set(state);
            x70.b.t(this, "Busy exception, skipping this conversation", new Object[0]);
        }
    }

    public final <T> T K() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        WaitForInput waitForInput = this.f33145b.get();
        if (this.f33146c.get() == State.f33151c) {
            waitForInput.b();
            waitForInput.f();
        }
        return (T) waitForInput.f();
    }

    public final void p() {
        this.f33146c.set(State.f33151c);
        WaitForInput waitForInput = this.f33145b.get();
        if (waitForInput != null) {
            waitForInput.b();
        }
        WppDeviceConversation wppDeviceConversation = this.f33144a.get();
        if (wppDeviceConversation != null) {
            wppDeviceConversation.p();
        }
        A();
    }

    public final f q() {
        return this.f33147d;
    }

    public final Context r() {
        w.d dVar = this.f33148e;
        if (dVar != null) {
            return ((i) dVar).d();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <C extends WppDeviceConversation> C s(Class<C> cls) {
        return (C) t(cls, new Object());
    }

    public final <C extends WppDeviceConversation> C t(Class<C> cls, u70.b<C> bVar) {
        if (cls.isInstance(this) && bVar.isMatching(cls.cast(this))) {
            return cls.cast(this);
        }
        WppDeviceConversation wppDeviceConversation = this.f33144a.get();
        if (wppDeviceConversation != null) {
            return (C) wppDeviceConversation.t(cls, bVar);
        }
        return null;
    }

    public b u() {
        return null;
    }

    public final u70.i v() {
        return x().g();
    }

    public final State w() {
        return this.f33146c.get();
    }

    public final cj.b x() {
        f fVar = this.f33147d;
        if (fVar != null) {
            return fVar.v();
        }
        return null;
    }

    public final c y() {
        return x().b();
    }

    public final w.d z() {
        return this.f33148e;
    }

    protected void A() {
    }
}
