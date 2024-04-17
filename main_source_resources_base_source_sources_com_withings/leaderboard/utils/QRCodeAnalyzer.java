package com.withings.leaderboard.utils;

import android.graphics.Matrix;
import android.media.Image;
import android.util.Size;
import androidx.camera.camera2.internal.k0;
import androidx.camera.core.d0;
import androidx.camera.core.s0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import dp0.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import nm0.y;
import ym0.l;
/* compiled from: QRCodeAnalyzer.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002\"#B\u001b\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0014¢\u0006\u0004\b \u0010!J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/withings/leaderboard/utils/QRCodeAnalyzer;", "Landroidx/camera/core/d0$a;", "Landroid/media/Image;", "mediaImage", "Landroidx/camera/core/s0;", "imageProxy", "Lnm0/y;", "closeImages", "(Landroid/media/Image;Landroidx/camera/core/s0;)V", "Lae/a;", "barcode", "Lcom/withings/leaderboard/utils/QRCodeAnalyzer$QRCodeValue;", "getQRCodeValue", "(Lae/a;)Lcom/withings/leaderboard/utils/QRCodeAnalyzer$QRCodeValue;", "", "barcodes", "onQRCodesFound", "(Ljava/util/List;)V", "analyze", "(Landroidx/camera/core/s0;)V", "Lkotlin/Function1;", "callback", "Lym0/l;", "Lzd/a;", "barcodeScanner$delegate", "Lnm0/g;", "getBarcodeScanner", "()Lzd/a;", "barcodeScanner", "", "foundQRCode", "Z", "<init>", "(Lym0/l;)V", "Companion", "QRCodeValue", "leaderboard_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class QRCodeAnalyzer implements d0.a {
    private static final String QRCODE_CONTENT_DELIMITER = ":|:";
    private static final int QRCODE_CONTENT_FRIEND_HASH_INDEX = 2;
    private static final int QRCODE_CONTENT_SIZE = 3;
    private static final int QRCODE_CONTENT_USERNAME_INDEX = 1;
    private static final String QRCODE_CONTENT_WITHINGS = "Withings";
    private static final int QRCODE_CONTENT_WITHINGS_INDEX = 0;
    private final g barcodeScanner$delegate;
    private final l<QRCodeValue, y> callback;
    private boolean foundQRCode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: QRCodeAnalyzer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/withings/leaderboard/utils/QRCodeAnalyzer$Companion;", "", "()V", "QRCODE_CONTENT_DELIMITER", "", "QRCODE_CONTENT_FRIEND_HASH_INDEX", "", "QRCODE_CONTENT_SIZE", "QRCODE_CONTENT_USERNAME_INDEX", "QRCODE_CONTENT_WITHINGS", "QRCODE_CONTENT_WITHINGS_INDEX", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: QRCodeAnalyzer.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/withings/leaderboard/utils/QRCodeAnalyzer$QRCodeValue;", "", "userName", "", "friendHash", "(Ljava/lang/String;Ljava/lang/String;)V", "getFriendHash", "()Ljava/lang/String;", "getUserName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class QRCodeValue {
        public static final int $stable = 0;
        private final String friendHash;
        private final String userName;

        public QRCodeValue(String userName, String friendHash) {
            u.j(userName, "userName");
            u.j(friendHash, "friendHash");
            this.userName = userName;
            this.friendHash = friendHash;
        }

        public static /* synthetic */ QRCodeValue copy$default(QRCodeValue qRCodeValue, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = qRCodeValue.userName;
            }
            if ((i11 & 2) != 0) {
                str2 = qRCodeValue.friendHash;
            }
            return qRCodeValue.copy(str, str2);
        }

        public final String component1() {
            return this.userName;
        }

        public final String component2() {
            return this.friendHash;
        }

        public final QRCodeValue copy(String userName, String friendHash) {
            u.j(userName, "userName");
            u.j(friendHash, "friendHash");
            return new QRCodeValue(userName, friendHash);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QRCodeValue)) {
                return false;
            }
            QRCodeValue qRCodeValue = (QRCodeValue) obj;
            if (u.e(this.userName, qRCodeValue.userName) && u.e(this.friendHash, qRCodeValue.friendHash)) {
                return true;
            }
            return false;
        }

        public final String getFriendHash() {
            return this.friendHash;
        }

        public final String getUserName() {
            return this.userName;
        }

        public int hashCode() {
            return this.friendHash.hashCode() + (this.userName.hashCode() * 31);
        }

        public String toString() {
            return k0.c("QRCodeValue(userName=", this.userName, ", friendHash=", this.friendHash, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QRCodeAnalyzer(l<? super QRCodeValue, y> callback) {
        u.j(callback, "callback");
        this.callback = callback;
        this.barcodeScanner$delegate = h.b(QRCodeAnalyzer$barcodeScanner$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void analyze$lambda$2$lambda$0(l tmp0, Object obj) {
        u.j(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void analyze$lambda$2$lambda$1(QRCodeAnalyzer this$0, Image mediaImage, s0 imageProxy, Task it) {
        u.j(this$0, "this$0");
        u.j(mediaImage, "$mediaImage");
        u.j(imageProxy, "$imageProxy");
        u.j(it, "it");
        this$0.closeImages(mediaImage, imageProxy);
    }

    private final void closeImages(Image image, s0 s0Var) {
        image.close();
        s0Var.close();
    }

    private final zd.a getBarcodeScanner() {
        return (zd.a) this.barcodeScanner$delegate.getValue();
    }

    private final QRCodeValue getQRCodeValue(ae.a aVar) {
        String b10 = aVar.b();
        if (b10 == null) {
            return null;
        }
        List o11 = j.o(b10, new String[]{QRCODE_CONTENT_DELIMITER});
        if (o11.size() != 3 || !u.e(o11.get(0), QRCODE_CONTENT_WITHINGS)) {
            return null;
        }
        return new QRCodeValue((String) o11.get(1), (String) o11.get(2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onQRCodesFound(List<? extends ae.a> list) {
        QRCodeValue qRCodeValue;
        if (!list.isEmpty() && !this.foundQRCode && (qRCodeValue = getQRCodeValue((ae.a) x.I(list))) != null) {
            this.foundQRCode = true;
            this.callback.invoke(qRCodeValue);
        }
    }

    @Override // androidx.camera.core.d0.a
    public void analyze(final s0 imageProxy) {
        u.j(imageProxy, "imageProxy");
        final Image n22 = imageProxy.n2();
        if (n22 != null) {
            Task<List<ae.a>> h12 = getBarcodeScanner().h1(de.a.b(n22, imageProxy.X1().d()));
            final QRCodeAnalyzer$analyze$1$1 qRCodeAnalyzer$analyze$1$1 = new QRCodeAnalyzer$analyze$1$1(this);
            h12.addOnSuccessListener(new OnSuccessListener() { // from class: com.withings.leaderboard.utils.a
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    QRCodeAnalyzer.analyze$lambda$2$lambda$0(l.this, obj);
                }
            }).addOnCompleteListener(new OnCompleteListener() { // from class: com.withings.leaderboard.utils.b
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    QRCodeAnalyzer.analyze$lambda$2$lambda$1(QRCodeAnalyzer.this, n22, imageProxy, task);
                }
            });
        }
    }

    @Override // androidx.camera.core.d0.a
    public /* bridge */ /* synthetic */ Size getDefaultTargetResolution() {
        return null;
    }

    public /* bridge */ /* synthetic */ int getTargetCoordinateSystem() {
        return 0;
    }

    public /* bridge */ /* synthetic */ void updateTransform(Matrix matrix) {
    }
}
