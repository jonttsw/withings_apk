package com.withings.programs.model.webservice.programoverview;

import com.samsung.android.sdk.healthdata.HealthConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: Data.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/programs/model/webservice/programoverview/Data.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/programs/model/webservice/programoverview/Data;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/programs/model/webservice/programoverview/Data;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/programs/model/webservice/programoverview/Data;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Data$$serializer implements GeneratedSerializer<Data> {
    public static final Data$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Data$$serializer data$$serializer = new Data$$serializer();
        INSTANCE = data$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.programs.model.webservice.programoverview.Data", data$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("identifier", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("tags", false);
        pluginGeneratedSerialDescriptor.addElement("featureImage", false);
        pluginGeneratedSerialDescriptor.addElement(HealthConstants.FoodInfo.DESCRIPTION, false);
        pluginGeneratedSerialDescriptor.addElement("contentTypePreview", false);
        pluginGeneratedSerialDescriptor.addElement("deviceDescription", false);
        pluginGeneratedSerialDescriptor.addElement("recommendedDevices", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Data$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = Data.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, kSerializerArr[2], stringSerializer, stringSerializer, kSerializerArr[5], BuiltinSerializersKt.getNullable(stringSerializer), kSerializerArr[7]};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Data deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i11;
        List list;
        String str;
        List list2;
        String str2;
        String str3;
        List list3;
        String str4;
        String str5;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = Data.$childSerializers;
        int i12 = 6;
        String str6 = null;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 1);
            String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 3);
            String decodeStringElement4 = beginStructure.decodeStringElement(descriptor2, 4);
            list = (List) beginStructure.decodeSerializableElement(descriptor2, 7, kSerializerArr[7], null);
            str2 = decodeStringElement;
            str = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, null);
            str4 = decodeStringElement3;
            str5 = decodeStringElement4;
            i11 = 255;
            list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            list3 = (List) beginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            str3 = decodeStringElement2;
        } else {
            boolean z5 = true;
            int i13 = 0;
            List list4 = null;
            String str7 = null;
            List list5 = null;
            String str8 = null;
            List list6 = null;
            String str9 = null;
            String str10 = null;
            while (z5) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z5 = false;
                        i12 = 6;
                        break;
                    case 0:
                        i13 |= 1;
                        str6 = beginStructure.decodeStringElement(descriptor2, 0);
                        i12 = 6;
                        break;
                    case 1:
                        str8 = beginStructure.decodeStringElement(descriptor2, 1);
                        i13 |= 2;
                        i12 = 6;
                        break;
                    case 2:
                        list6 = (List) beginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], list6);
                        i13 |= 4;
                        i12 = 6;
                        break;
                    case 3:
                        str9 = beginStructure.decodeStringElement(descriptor2, 3);
                        i13 |= 8;
                        continue;
                    case 4:
                        str10 = beginStructure.decodeStringElement(descriptor2, 4);
                        i13 |= 16;
                        break;
                    case 5:
                        list5 = (List) beginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], list5);
                        i13 |= 32;
                        break;
                    case 6:
                        str7 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, i12, StringSerializer.INSTANCE, str7);
                        i13 |= 64;
                        break;
                    case 7:
                        list4 = (List) beginStructure.decodeSerializableElement(descriptor2, 7, kSerializerArr[7], list4);
                        i13 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i11 = i13;
            list = list4;
            str = str7;
            list2 = list5;
            str2 = str6;
            str3 = str8;
            list3 = list6;
            str4 = str9;
            str5 = str10;
        }
        beginStructure.endStructure(descriptor2);
        return new Data(i11, str2, str3, list3, str4, str5, list2, str, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Data value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        Data.write$Self$android_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
