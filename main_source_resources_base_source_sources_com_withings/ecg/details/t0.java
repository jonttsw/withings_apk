package com.withings.ecg.details;

import android.content.Context;
import com.withings.note.model.NoteLiveData;
import com.withings.note.model.NoteRepository;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgDetailsFragment.kt */
/* loaded from: classes3.dex */
public final class t0 extends kotlin.jvm.internal.w implements ym0.a<NoteLiveData> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0 f38309a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f38310b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(b0 b0Var, long j5) {
        super(0);
        this.f38309a = b0Var;
        this.f38310b = j5;
    }

    @Override // ym0.a
    public final NoteLiveData invoke() {
        NoteRepository noteRepository;
        b0 b0Var = this.f38309a;
        qm0.f coroutineContext = androidx.lifecycle.h1.a(b0Var).getCoroutineContext();
        Context context = b0Var.f38097a;
        androidx.lifecycle.j0 j0Var = b0Var.f38108l;
        noteRepository = b0Var.f38099c;
        return new NoteLiveData(coroutineContext, context, null, noteRepository, j0Var, this.f38310b, null, 68, null);
    }
}
