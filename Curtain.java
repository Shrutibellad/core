class Curtain{
String color;
String materialType;
float size;
boolean lightAbsorb;
String quality;

String getColor(){
return this.color;
}
String getMaterialType(){
return this.materialType;
}
float getSize(){
return this.size;
}
boolean getLightAbsorb(){
return this.lightAbsorb;
}
String getQuality(){
return this.quality;
}

void setColor(String color){
this.color=color;
}
void setMaterialType(String materialType){
this.materialType=materialType;
}
void setSize(float size){
this.size=size;
}
void setLightAbsorb(boolean lightAbsorb){
this.lightAbsorb=lightAbsorb;
}
void setQuality(String quality){
this.quality=quality;
}
}
