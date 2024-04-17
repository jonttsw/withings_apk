package com.withings.wiscale2.device.consumable.model;

import androidx.appcompat.app.h;
import com.google.gson.annotations.SerializedName;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.vasistas.ws.WsVasistasSerie;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: Consumable.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b;\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bí\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001cJ\t\u00109\u001a\u00020\u0003HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0011\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J\u0011\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0016HÆ\u0003J\u0011\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ¢\u0002\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00162\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00152\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010PJ\u0013\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010T\u001a\u00020\u0016HÖ\u0001J\t\u0010U\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001eR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b!\u0010\u001eR\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\"\u0010\u001eR\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b%\u0010\u001eR\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b&\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001a\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b)\u0010\u001eR\u001a\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b*\u0010\u001eR\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0011\u0010\u0019\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b0\u0010\u001eR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b1\u0010\u001eR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b2\u0010\u001eR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b3\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010/R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b5\u0010\u001eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010/R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b7\u0010\u001eR\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010$¨\u0006V"}, d2 = {"Lcom/withings/wiscale2/device/consumable/model/Consumable;", "", "id", "", "serial", "", "tagUid", "productId", "consumerId", "deviceId", "useCount", "status", "lastUsedDate", "lastStatusUpdateDate", "passwordGenerationDate", "effectiveExpirationDate", "printedExpirationDate", "afterInstallMaxDate", "modified", ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "disposition", "", "", "usedSlotPositions", "modelName", WsVasistasSerie.KEY_MODEL, "listIdMaterialLot", "firstAssociationDate", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILjava/util/List;Ljava/lang/Long;)V", "getAfterInstallMaxDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getConsumerId", "getCreated", "getDeviceId", "getDisposition", "()Ljava/util/List;", "getEffectiveExpirationDate", "getFirstAssociationDate", "getId", "()J", "getLastStatusUpdateDate", "getLastUsedDate", "getListIdMaterialLot", "getModel", "()I", "getModelName", "()Ljava/lang/String;", "getModified", "getPasswordGenerationDate", "getPrintedExpirationDate", "getProductId", "getSerial", "getStatus", "getTagUid", "getUseCount", "getUsedSlotPositions", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILjava/util/List;Ljava/lang/Long;)Lcom/withings/wiscale2/device/consumable/model/Consumable;", "equals", "", "other", "hashCode", "toString", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Consumable {
    public static final int $stable = 8;
    @SerializedName("atfer_install_max_date")
    private final Long afterInstallMaxDate;
    @SerializedName("id_consumer")
    private final Long consumerId;
    private final Long created;
    @SerializedName("deviceid")
    private final Long deviceId;
    private final List<Integer> disposition;
    @SerializedName("effective_expiration_date")
    private final Long effectiveExpirationDate;
    @SerializedName("first_association_date")
    private final Long firstAssociationDate;

    /* renamed from: id  reason: collision with root package name */
    private final long f54146id;
    @SerializedName("last_status_update_date")
    private final Long lastStatusUpdateDate;
    @SerializedName("last_used_date")
    private final Long lastUsedDate;
    @SerializedName("list_id_material_lot")
    private final List<Long> listIdMaterialLot;
    private final int model;
    @SerializedName("modelname")
    private final String modelName;
    private final Long modified;
    @SerializedName("password_generation_date")
    private final Long passwordGenerationDate;
    @SerializedName("printed_expiration_date")
    private final Long printedExpirationDate;
    @SerializedName("id_product")
    private final Long productId;
    private final String serial;
    private final Long status;
    @SerializedName("taguid")
    private final String tagUid;
    @SerializedName("use_count")
    private final Long useCount;
    @SerializedName("used_slot_positions")
    private final List<Integer> usedSlotPositions;

    public Consumable(long j5, String serial, String str, Long l5, Long l6, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, Long l17, Long l18, Long l19, Long l21, Long l22, List<Integer> list, List<Integer> list2, String str2, int i11, List<Long> list3, Long l23) {
        u.j(serial, "serial");
        this.f54146id = j5;
        this.serial = serial;
        this.tagUid = str;
        this.productId = l5;
        this.consumerId = l6;
        this.deviceId = l11;
        this.useCount = l12;
        this.status = l13;
        this.lastUsedDate = l14;
        this.lastStatusUpdateDate = l15;
        this.passwordGenerationDate = l16;
        this.effectiveExpirationDate = l17;
        this.printedExpirationDate = l18;
        this.afterInstallMaxDate = l19;
        this.modified = l21;
        this.created = l22;
        this.disposition = list;
        this.usedSlotPositions = list2;
        this.modelName = str2;
        this.model = i11;
        this.listIdMaterialLot = list3;
        this.firstAssociationDate = l23;
    }

    public final long component1() {
        return this.f54146id;
    }

    public final Long component10() {
        return this.lastStatusUpdateDate;
    }

    public final Long component11() {
        return this.passwordGenerationDate;
    }

    public final Long component12() {
        return this.effectiveExpirationDate;
    }

    public final Long component13() {
        return this.printedExpirationDate;
    }

    public final Long component14() {
        return this.afterInstallMaxDate;
    }

    public final Long component15() {
        return this.modified;
    }

    public final Long component16() {
        return this.created;
    }

    public final List<Integer> component17() {
        return this.disposition;
    }

    public final List<Integer> component18() {
        return this.usedSlotPositions;
    }

    public final String component19() {
        return this.modelName;
    }

    public final String component2() {
        return this.serial;
    }

    public final int component20() {
        return this.model;
    }

    public final List<Long> component21() {
        return this.listIdMaterialLot;
    }

    public final Long component22() {
        return this.firstAssociationDate;
    }

    public final String component3() {
        return this.tagUid;
    }

    public final Long component4() {
        return this.productId;
    }

    public final Long component5() {
        return this.consumerId;
    }

    public final Long component6() {
        return this.deviceId;
    }

    public final Long component7() {
        return this.useCount;
    }

    public final Long component8() {
        return this.status;
    }

    public final Long component9() {
        return this.lastUsedDate;
    }

    public final Consumable copy(long j5, String serial, String str, Long l5, Long l6, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, Long l17, Long l18, Long l19, Long l21, Long l22, List<Integer> list, List<Integer> list2, String str2, int i11, List<Long> list3, Long l23) {
        u.j(serial, "serial");
        return new Consumable(j5, serial, str, l5, l6, l11, l12, l13, l14, l15, l16, l17, l18, l19, l21, l22, list, list2, str2, i11, list3, l23);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Consumable)) {
            return false;
        }
        Consumable consumable = (Consumable) obj;
        if (this.f54146id == consumable.f54146id && u.e(this.serial, consumable.serial) && u.e(this.tagUid, consumable.tagUid) && u.e(this.productId, consumable.productId) && u.e(this.consumerId, consumable.consumerId) && u.e(this.deviceId, consumable.deviceId) && u.e(this.useCount, consumable.useCount) && u.e(this.status, consumable.status) && u.e(this.lastUsedDate, consumable.lastUsedDate) && u.e(this.lastStatusUpdateDate, consumable.lastStatusUpdateDate) && u.e(this.passwordGenerationDate, consumable.passwordGenerationDate) && u.e(this.effectiveExpirationDate, consumable.effectiveExpirationDate) && u.e(this.printedExpirationDate, consumable.printedExpirationDate) && u.e(this.afterInstallMaxDate, consumable.afterInstallMaxDate) && u.e(this.modified, consumable.modified) && u.e(this.created, consumable.created) && u.e(this.disposition, consumable.disposition) && u.e(this.usedSlotPositions, consumable.usedSlotPositions) && u.e(this.modelName, consumable.modelName) && this.model == consumable.model && u.e(this.listIdMaterialLot, consumable.listIdMaterialLot) && u.e(this.firstAssociationDate, consumable.firstAssociationDate)) {
            return true;
        }
        return false;
    }

    public final Long getAfterInstallMaxDate() {
        return this.afterInstallMaxDate;
    }

    public final Long getConsumerId() {
        return this.consumerId;
    }

    public final Long getCreated() {
        return this.created;
    }

    public final Long getDeviceId() {
        return this.deviceId;
    }

    public final List<Integer> getDisposition() {
        return this.disposition;
    }

    public final Long getEffectiveExpirationDate() {
        return this.effectiveExpirationDate;
    }

    public final Long getFirstAssociationDate() {
        return this.firstAssociationDate;
    }

    public final long getId() {
        return this.f54146id;
    }

    public final Long getLastStatusUpdateDate() {
        return this.lastStatusUpdateDate;
    }

    public final Long getLastUsedDate() {
        return this.lastUsedDate;
    }

    public final List<Long> getListIdMaterialLot() {
        return this.listIdMaterialLot;
    }

    public final int getModel() {
        return this.model;
    }

    public final String getModelName() {
        return this.modelName;
    }

    public final Long getModified() {
        return this.modified;
    }

    public final Long getPasswordGenerationDate() {
        return this.passwordGenerationDate;
    }

    public final Long getPrintedExpirationDate() {
        return this.printedExpirationDate;
    }

    public final Long getProductId() {
        return this.productId;
    }

    public final String getSerial() {
        return this.serial;
    }

    public final Long getStatus() {
        return this.status;
    }

    public final String getTagUid() {
        return this.tagUid;
    }

    public final Long getUseCount() {
        return this.useCount;
    }

    public final List<Integer> getUsedSlotPositions() {
        return this.usedSlotPositions;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int c11 = d.c(this.serial, Long.hashCode(this.f54146id) * 31, 31);
        String str = this.tagUid;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (c11 + hashCode) * 31;
        Long l5 = this.productId;
        if (l5 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l5.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Long l6 = this.consumerId;
        if (l6 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l6.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        Long l11 = this.deviceId;
        if (l11 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l11.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        Long l12 = this.useCount;
        if (l12 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l12.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        Long l13 = this.status;
        if (l13 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l13.hashCode();
        }
        int i17 = (i16 + hashCode6) * 31;
        Long l14 = this.lastUsedDate;
        if (l14 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = l14.hashCode();
        }
        int i18 = (i17 + hashCode7) * 31;
        Long l15 = this.lastStatusUpdateDate;
        if (l15 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = l15.hashCode();
        }
        int i19 = (i18 + hashCode8) * 31;
        Long l16 = this.passwordGenerationDate;
        if (l16 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = l16.hashCode();
        }
        int i21 = (i19 + hashCode9) * 31;
        Long l17 = this.effectiveExpirationDate;
        if (l17 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = l17.hashCode();
        }
        int i22 = (i21 + hashCode10) * 31;
        Long l18 = this.printedExpirationDate;
        if (l18 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = l18.hashCode();
        }
        int i23 = (i22 + hashCode11) * 31;
        Long l19 = this.afterInstallMaxDate;
        if (l19 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = l19.hashCode();
        }
        int i24 = (i23 + hashCode12) * 31;
        Long l21 = this.modified;
        if (l21 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = l21.hashCode();
        }
        int i25 = (i24 + hashCode13) * 31;
        Long l22 = this.created;
        if (l22 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = l22.hashCode();
        }
        int i26 = (i25 + hashCode14) * 31;
        List<Integer> list = this.disposition;
        if (list == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = list.hashCode();
        }
        int i27 = (i26 + hashCode15) * 31;
        List<Integer> list2 = this.usedSlotPositions;
        if (list2 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = list2.hashCode();
        }
        int i28 = (i27 + hashCode16) * 31;
        String str2 = this.modelName;
        if (str2 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str2.hashCode();
        }
        int a11 = h.a(this.model, (i28 + hashCode17) * 31, 31);
        List<Long> list3 = this.listIdMaterialLot;
        if (list3 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = list3.hashCode();
        }
        int i29 = (a11 + hashCode18) * 31;
        Long l23 = this.firstAssociationDate;
        if (l23 != null) {
            i11 = l23.hashCode();
        }
        return i29 + i11;
    }

    public String toString() {
        long j5 = this.f54146id;
        String str = this.serial;
        String str2 = this.tagUid;
        Long l5 = this.productId;
        Long l6 = this.consumerId;
        Long l11 = this.deviceId;
        Long l12 = this.useCount;
        Long l13 = this.status;
        Long l14 = this.lastUsedDate;
        Long l15 = this.lastStatusUpdateDate;
        Long l16 = this.passwordGenerationDate;
        Long l17 = this.effectiveExpirationDate;
        Long l18 = this.printedExpirationDate;
        Long l19 = this.afterInstallMaxDate;
        Long l21 = this.modified;
        Long l22 = this.created;
        List<Integer> list = this.disposition;
        List<Integer> list2 = this.usedSlotPositions;
        String str3 = this.modelName;
        int i11 = this.model;
        List<Long> list3 = this.listIdMaterialLot;
        Long l23 = this.firstAssociationDate;
        return "Consumable(id=" + j5 + ", serial=" + str + ", tagUid=" + str2 + ", productId=" + l5 + ", consumerId=" + l6 + ", deviceId=" + l11 + ", useCount=" + l12 + ", status=" + l13 + ", lastUsedDate=" + l14 + ", lastStatusUpdateDate=" + l15 + ", passwordGenerationDate=" + l16 + ", effectiveExpirationDate=" + l17 + ", printedExpirationDate=" + l18 + ", afterInstallMaxDate=" + l19 + ", modified=" + l21 + ", created=" + l22 + ", disposition=" + list + ", usedSlotPositions=" + list2 + ", modelName=" + str3 + ", model=" + i11 + ", listIdMaterialLot=" + list3 + ", firstAssociationDate=" + l23 + ")";
    }
}
