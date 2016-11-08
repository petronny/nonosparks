import json
stage='13'
data={}
data['width']=10
data['height']=10
data['name']='Ms Nonoah'
data['hints']={}
data['hints']['horizontal']=['3 4','2 2 4','1 3 1','6 1','2 1 1 1','2 1 1 1','1 1 1','2 3','2 1 1 1','2 1 3']
data['hints']['vertical']=['8','2 3 3','1 2 1','5 2','3 3 1','2 2','2 2','2 1 1','2 2 1','3 2']
data['answer']=[]
data['answer'].append([0,1,1,1,1,1,1,1,1,0])
data['answer'].append([1,1,0,1,1,1,0,1,1,1])
data['answer'].append([1,0,1,1,0,0,0,0,0,1])
data['answer'].append([1,1,1,1,1,0,0,1,1,0])
data['answer'].append([0,1,1,1,0,1,1,1,0,1])
data['answer'].append([0,0,0,1,1,0,0,1,1,0])
data['answer'].append([1,1,0,0,0,1,1,0,0,0])
data['answer'].append([1,1,0,1,0,0,0,0,0,1])
data['answer'].append([1,1,0,0,1,1,0,0,0,1])
data['answer'].append([1,1,1,0,0,0,0,0,1,1])

json.dump(data,open(stage+'.json','w'),sort_keys=True)
