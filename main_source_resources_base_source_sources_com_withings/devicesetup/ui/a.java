package com.withings.devicesetup.ui;

import android.content.Context;
import android.content.Intent;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
/* compiled from: SetupActivityUpdater.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f37888a;

    /* renamed from: b  reason: collision with root package name */
    private Setup f37889b;

    /* renamed from: c  reason: collision with root package name */
    private cj.b f37890c;

    /* renamed from: d  reason: collision with root package name */
    private SetupActivity f37891d;

    /* renamed from: e  reason: collision with root package name */
    private SetupActivity.a f37892e;

    /* renamed from: f  reason: collision with root package name */
    private Exception f37893f;

    /* renamed from: g  reason: collision with root package name */
    private SetupStateListener f37894g;

    /* compiled from: SetupActivityUpdater.java */
    /* renamed from: com.withings.devicesetup.ui.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    final class C0498a implements SetupActivity.a {
        @Override // com.withings.devicesetup.ui.SetupActivity.a
        public final void h(SetupActivity setupActivity) {
            setupActivity.m4();
        }
    }

    /* compiled from: SetupActivityUpdater.java */
    /* loaded from: classes3.dex */
    final class b implements SetupActivity.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Exception f37895a;

        b(Exception exc) {
            this.f37895a = exc;
        }

        @Override // com.withings.devicesetup.ui.SetupActivity.a
        public final void h(SetupActivity setupActivity) {
            setupActivity.g4(this.f37895a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SetupActivityUpdater.java */
    /* loaded from: classes3.dex */
    public final class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            if (aVar.f37891d != null && !aVar.f37891d.W3() && aVar.f37892e != null) {
                aVar.f37892e.h(aVar.f37891d);
            }
        }
    }

    public a(Context context, Setup setup) {
        this.f37888a = context.getApplicationContext();
        this.f37889b = setup;
    }

    private void i() {
        cj.d dVar;
        cj.b bVar = this.f37890c;
        if (bVar != null) {
            dVar = cj.d.a(bVar);
        } else {
            dVar = null;
        }
        this.f37891d.setIntent(SetupActivity.P3(this.f37888a, this.f37889b, dVar, this.f37894g));
        this.f37891d.runOnUiThread(new c());
    }

    public final void c() {
        SetupActivity setupActivity = this.f37891d;
        if (setupActivity != null) {
            this.f37889b.r0(setupActivity);
            this.f37891d.setResult(-1);
            this.f37891d.finish();
        }
    }

    public final SetupActivity.a d() {
        return this.f37892e;
    }

    public final void e(SetupActivity setupActivity) {
        this.f37891d = setupActivity;
    }

    public final void f(SetupConversation setupConversation) {
        this.f37889b = setupConversation.O();
        this.f37890c = setupConversation.x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.devicesetup.ui.SetupActivity$a, java.lang.Object] */
    public final void g() {
        j(new Object());
    }

    public final void h(Exception exc) {
        this.f37893f = exc;
        k(new b(exc));
    }

    public final void j(SetupActivity.a aVar) {
        this.f37892e = aVar;
        this.f37893f = null;
        if (this.f37891d != null) {
            i();
        }
    }

    public final void k(SetupActivity.a aVar) {
        this.f37892e = aVar;
        cj.d dVar = null;
        this.f37893f = null;
        if (this.f37891d != null) {
            i();
            return;
        }
        cj.b bVar = this.f37890c;
        if (bVar != null) {
            dVar = cj.d.a(bVar);
        }
        Setup setup = this.f37889b;
        Exception exc = this.f37893f;
        SetupStateListener setupStateListener = this.f37894g;
        Context context = this.f37888a;
        Intent putExtra = SetupActivity.P3(context, setup, dVar, setupStateListener).putExtra("error", exc);
        putExtra.addFlags(268435456);
        putExtra.addFlags(67108864);
        context.startActivity(putExtra);
    }

    public a(Context context, Setup setup, SetupStateListener setupStateListener) {
        this(context, setup);
        this.f37894g = setupStateListener;
    }
}
