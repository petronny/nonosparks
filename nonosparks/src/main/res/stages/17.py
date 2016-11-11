import json
stage='17'
data={}
data['width']=15
data['height']=10
data['name']='Giant turtle'
data['hints']={}
data['hints']['horizontal']=['7','1 1 1','1 2 2','1 3 1','2 1 1','1 4','1 1 1','4 1','1 2 2','1 1 2','1 4 1','2 1 3','3','1 1','2']
data['hints']['vertical']=['6','1 1 1 2','1 1 1 1','1 1 1 5','1 4 1 1 1 1','1 1 1 1 4','3 1 2','1 6 1','1 1 2 1','3 3']
data['answer']=[]
data['answer'].append([0,0,0,1,1,1,1,1,1,0,0,0,0,0,0])
data['answer'].append([0,0,1,0,1,0,0,1,0,1,1,0,0,0,0])
data['answer'].append([0,1,0,1,0,0,0,1,0,0,0,1,0,0,0])
data['answer'].append([1,0,0,1,0,0,0,1,0,0,1,1,1,1,1])
data['answer'].append([1,0,0,1,1,1,1,0,1,0,1,0,1,0,1])
data['answer'].append([1,0,1,0,0,1,0,0,1,0,1,1,1,1,0])
data['answer'].append([1,1,1,0,0,1,0,0,0,1,1,0,0,0,0])
data['answer'].append([1,0,0,1,1,1,1,1,1,0,0,1,0,0,0])
data['answer'].append([1,0,1,0,0,0,0,0,1,1,0,1,0,0,0])
data['answer'].append([1,1,1,0,0,0,0,0,0,1,1,1,0,0,0])

json.dump(data,open(stage+'.json','w'),sort_keys=True)
