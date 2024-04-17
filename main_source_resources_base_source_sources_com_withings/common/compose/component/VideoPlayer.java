package com.withings.common.compose.component;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.a;
import androidx.media3.datasource.d;
import androidx.media3.exoplayer.g;
import androidx.media3.exoplayer.source.y;
import kotlin.Metadata;
import m6.o;
/* compiled from: VideoPlayer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/common/compose/component/VideoPlayer;", "Landroid/os/Parcelable;", "<init>", "()V", "remedy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class VideoPlayer implements Parcelable {
    public static final Parcelable.Creator<VideoPlayer> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private a.C0139a f33354a;

    /* renamed from: b  reason: collision with root package name */
    private androidx.media3.exoplayer.g f33355b;

    /* compiled from: VideoPlayer.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<VideoPlayer> {
        @Override // android.os.Parcelable.Creator
        public final VideoPlayer createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.u.j(parcel, "parcel");
            parcel.readInt();
            return new VideoPlayer();
        }

        @Override // android.os.Parcelable.Creator
        public final VideoPlayer[] newArray(int i11) {
            return new VideoPlayer[i11];
        }
    }

    public final androidx.media3.exoplayer.g a(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        androidx.media3.exoplayer.g gVar = this.f33355b;
        if (gVar == null) {
            androidx.media3.exoplayer.g a11 = new g.b(context).a();
            this.f33355b = a11;
            return a11;
        }
        return gVar;
    }

    public final void b(Context context, Uri videoUri, boolean z5) {
        androidx.media3.exoplayer.source.y yVar;
        kotlin.jvm.internal.u.j(context, "context");
        kotlin.jvm.internal.u.j(videoUri, "videoUri");
        androidx.media3.exoplayer.g gVar = this.f33355b;
        if (gVar != null) {
            gVar.W(z5 ? 1 : 0);
            if (this.f33354a == null) {
                d.a aVar = new d.a();
                aVar.c("HealthMate-Android");
                a.C0139a c0139a = new a.C0139a();
                c0139a.b(q5.b(context));
                c0139a.c(aVar);
                this.f33354a = c0139a;
            }
            int i11 = m6.o.f81264g;
            o.a aVar2 = new o.a();
            aVar2.f(videoUri);
            m6.o a11 = aVar2.a();
            a.C0139a c0139a2 = this.f33354a;
            if (c0139a2 != null) {
                yVar = new y.b(c0139a2).f(a11);
            } else {
                yVar = null;
            }
            if (yVar != null) {
                gVar.i(yVar);
                gVar.b();
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        kotlin.jvm.internal.u.j(out, "out");
        out.writeInt(1);
    }
}
