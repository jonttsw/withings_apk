package com.withings.wiscale2.activity.model.builder;

import com.withings.wiscale2.track.data.Track;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: ActivityBuilder.kt */
/* loaded from: classes4.dex */
final class a extends w implements l<Track, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f48487a = new w(1);

    @Override // ym0.l
    public final Boolean invoke(Track track) {
        boolean z5;
        Track it = track;
        u.j(it, "it");
        if (it.getCategory() == 7) {
            z5 = true;
        } else {
            z5 = false;
        }
        return Boolean.valueOf(z5);
    }
}
