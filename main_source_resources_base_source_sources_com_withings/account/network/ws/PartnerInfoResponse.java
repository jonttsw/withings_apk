package com.withings.account.network.ws;

import com.withings.webservices.legacy.withings.model.ImagesP4;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
/* compiled from: WsModels.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/withings/account/network/ws/PartnerInfoResponse;", "", "name", "", "desc", XHTMLText.IMG, "Lcom/withings/webservices/legacy/withings/model/ImagesP4;", "(Ljava/lang/String;Ljava/lang/String;Lcom/withings/webservices/legacy/withings/model/ImagesP4;)V", "getDesc", "()Ljava/lang/String;", "getImg", "()Lcom/withings/webservices/legacy/withings/model/ImagesP4;", "getName", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PartnerInfoResponse {
    public static final int $stable = 8;
    private final String desc;
    private final ImagesP4 img;
    private final String name;

    public PartnerInfoResponse(String name, String desc, ImagesP4 img) {
        u.j(name, "name");
        u.j(desc, "desc");
        u.j(img, "img");
        this.name = name;
        this.desc = desc;
        this.img = img;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final ImagesP4 getImg() {
        return this.img;
    }

    public final String getName() {
        return this.name;
    }
}
