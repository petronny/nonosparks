import json
stage='06'
data={}
data['width']=5
data['height']=10
data['hints']={}
data['hints']['horizontal']=['7','1 1 6','1 2 3','1 1 6','7']
data['hints']['vertical']=['3','1 1','2 2','1 1 1','5','2 2','5','5','3','1 1']
data['answer']=[]
data['answer'].append([0,1,1,1,0])
data['answer'].append([1,0,0,0,1])
data['answer'].append([1,1,0,1,1])
data['answer'].append([1,0,1,0,1])
data['answer'].append([1,1,1,1,1])
data['answer'].append([1,1,0,1,1])
data['answer'].append([1,1,1,1,1])
data['answer'].append([1,1,1,1,1])
data['answer'].append([0,1,1,1,0])
data['answer'].append([0,1,0,1,0])
data['tips']='tips/06.json'
json.dump(data,open('stages/'+stage+'.json','w'),sort_keys=True)
