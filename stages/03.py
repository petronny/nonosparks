import json
stage='03'
data={}
data['width']=5
data['height']=5
data['hints']={}
data['hints']['horizontal']=['1','2','2','2','2']
data['hints']['vertical']=['0','0','4','5','0']
data['answer']=[]
data['answer'].append([0,0,0,0,0])
data['answer'].append([0,0,0,0,0])
data['answer'].append([0,1,1,1,1])
data['answer'].append([1,1,1,1,1])
data['answer'].append([0,0,0,0,0])
data['tips']='tips/03.json'
json.dump(data,open('stages/'+stage+'.json','w'),sort_keys=True)
