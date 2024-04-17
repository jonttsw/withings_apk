package com.withings.core.ui;

import android.content.Context;
/* compiled from: Hilt_NoteEditionActivity.java */
/* loaded from: classes3.dex */
final class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_NoteEditionActivity f35378a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Hilt_NoteEditionActivity hilt_NoteEditionActivity) {
        this.f35378a = hilt_NoteEditionActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f35378a.inject();
    }
}
